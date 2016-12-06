package cn.com.sinosoft.wcm.web.manager;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmArticle;
import cn.com.sinosoft.wcm.service.website.ArticleService;

/**
 * 文章管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/article")
public class ArticleMgrController {
	
	@Resource
	ArticleService articleService;
	
	/**
	 * 文章列表
	 *
	 * @param channelId
	 * 			栏目id
	 * @param websiteId
	 * 			站点id
	 * @param title
	 * 			文章标题
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@PostMapping("list")
	public APIResult<PagingResult<TWcmArticle>> getList(Integer channelId,Integer websiteId,String title,PageParam pageParam) {
		PagingResult<TWcmArticle> result=articleService.getDocList(channelId, websiteId, title, pageParam);
		return new APIResult<PagingResult<TWcmArticle>>(result);
	}
	
	/**
	 * 添加文章
	 *
	 * @param tArticle
	 * 			文章信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addArticle(TWcmArticle tArticle){
		int m=articleService.addDoc(tArticle);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"添加失败");
		}
	}
	
	/**
	 * 删除文章
	 *
	 * @param id
	 * 			文章id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteArticle(Integer id){
		int m=articleService.deleteDoc(id);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"删除失败");
		}
	}
	
	/**
	 * 获取文章信息
	 *
	 * @param id
	 * 			文章id
	 * @return
	 */
	@GetMapping("get/detail")
	public APIResult<TWcmArticle> getArticle(Integer id){
		return new APIResult<TWcmArticle>(articleService.getDetailDoc(id));
	}
	
	/**
	 * 修改文章信息
	 *
	 * @param tArticle
	 * 			文章信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateArticle(TWcmArticle tArticle){
		int m=articleService.updateDoc(tArticle);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"修改失败");
		}
	}

}

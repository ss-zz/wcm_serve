package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmArticle;

/**
 * 文章管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/article")
public class ArticleMgrController {
	
	/**
	 * 
	 *
	 * @param params1
	 * 			参数1
	 * @param params2
	 * 			参数2
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@PostMapping("list")
	public APIResult<PagingResult<TWcmArticle>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmArticle>>(
				new PagingResult<TWcmArticle>());
	}
	
	/**
	 * 添加文章
	 *
	 * @param tArticle
	 * 			文章
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addArticle(TWcmArticle tArticle){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除文章
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteArticle(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取文章信息
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("get/detail")
	public APIResult<TWcmArticle> getArticle(Integer id){
		return new APIResult<TWcmArticle>();
	}
	
	/**
	 * 修改文章信息
	 *
	 * @param tArticle
	 * 			文章
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateArticle(TWcmArticle tArticle){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	
	/**
	 * 设置文章所用到的资源（图片、视频等）
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@PostMapping("resource")
	 public APIResult<String> setArticleResource(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	}

}

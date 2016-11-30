package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmWebsitePub;

/**
 * 文章管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/websitepub")
public class WebsitePubMgrController {
	
	/**
	 * 
	 *
	 * @param type
	 * 			类型
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@PostMapping("list")
	public APIResult<PagingResult<TWcmWebsitePub>> getList(String type,PageParam pageParam) {
		return new APIResult<PagingResult<TWcmWebsitePub>>(
				new PagingResult<TWcmWebsitePub>());
	}
	
	/**
	 * 发布页面
	 *
	 * @param tPub
	 * 			页面信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addPub(TWcmWebsitePub tPub){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"发布成功！");
	}
	
	/**
	 * 删除页面
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deletePub(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 预览页面
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("get/scan")
	public APIResult<TWcmWebsitePub> getPub(Integer id){
		return new APIResult<TWcmWebsitePub>();
	}
	
	/**
	 * 修改页面
	 *
	 * @param tPub
	 * 			页面信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updatePub(TWcmWebsitePub tPub){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	

}

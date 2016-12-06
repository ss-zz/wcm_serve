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
import cn.com.sinosoft.wcm.domain.wcm.TWcmWebsite;
import cn.com.sinosoft.wcm.service.website.WebSiteService;

/**
 * 站点管理控制器
 *
 * @author <a href="mainto:nytclizy@gmail.com">lizhiyong</a>
 * @since 2016年11月29日
 */
@RestController
@RequestMapping("mgr/website")
public class WebSiteMgrController {

	@Resource
	WebSiteService webSiteService;

	/**
	 * 站点列表
	 *
	 * @param str
	 * 			查询参数（名称、别名）
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@GetMapping("list")
	public APIResult<PagingResult<TWcmWebsite>> getList(String str,PageParam pageParam) {
		PagingResult<TWcmWebsite> result=webSiteService.getListWebsite(str, pageParam);
		return new APIResult<PagingResult<TWcmWebsite>>(result);
	}
	
	
	/**
	 * 添加站点
	 *
	 * @param tWebsite
	 * 			站点信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addWebsite(TWcmWebsite tWebsite){
		if(webSiteService.getWebsiteName(tWebsite.getName())){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"该站点名已存在");
		}
		else{
			int m=webSiteService.addWebsite(tWebsite);
			if(m>0){
				return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功");
			}
			else {
				return new APIResult<>(ResultCode.FAILURE.getCode(),"添加失败");
			}
		}
	}
	
	/**
	 * 根据id获取站点详细信息
	 *
	 * @param id
	 *  	 	站点id
	 * @return
	 */
	@GetMapping("detail")
	public APIResult<TWcmWebsite> getDetail(Integer id){
		return new APIResult<TWcmWebsite>(webSiteService.getWebsiteDetail(id));
	}
	
	/**
	 * 修改站点信息
	 *
	 * @param tWebsite
	 * 			站点信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateWebsite(TWcmWebsite tWebsite){
		int m=webSiteService.updateWebsite(tWebsite);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"修改失败");
		}
	}
	
	/**
	 * 删除站点
	 *
	 * @param id
	 * 			站点id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteWebsite(Integer id){
		int m=webSiteService.deleteWebsite(id);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"删除失败");
		}
	}
	
	/**
	 * 站点发布
	 *
	 * @param id
	 * 			站点id
	 * @return
	 */
	@PostMapping("pubWebsite")
	public APIResult<String> updateWebsitePub(Integer id){
		int m=webSiteService.updateWebsitePub(id);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"发布成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"发布失败");
		}
	}
	
	/**
	 * 更新站点的使用状态
	 *
	 * @param id
	 * 			站点id
	 * @param useState
	 * 			使用状态
	 * @return
	 */
	@PostMapping("useWebsite")
	public APIResult<String> updateWebsiteUse(Integer id,String useState){
		int m=webSiteService.updateWebsiteUse(id,useState);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"使用状态更新成功");
		}
		else {
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"使用状态更新失败");
		}
	}
	
	/**
	 * 设置站点模板
	 *
	 * @param id
	 * 			站点id
	 * @param templatesId
	 * 			模板id-首页
	 * @return
	 */
	@GetMapping("setTemplates")
	public APIResult<String> setWebsiteTemplate(Integer id,Integer templatesId){
		int m=webSiteService.setWebsiteTemplates(id, templatesId);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"模板设置成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"模板设置失败");
		}
	} 

}

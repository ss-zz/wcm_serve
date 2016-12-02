package cn.com.sinosoft.wcm.web.manager;

import java.util.List;

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
	 * 
	 *
	 * @param name
	 * 			站点名称
	 * @param alias
	 * 			站点别名
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@GetMapping("list")
	public APIResult<PagingResult<TWcmWebsite>> getList(String name,
			String alias, PageParam pageParam) {
		PagingResult<TWcmWebsite> result=webSiteService.getListWebsite(name, alias, pageParam);
		return new APIResult<PagingResult<TWcmWebsite>>(result);
	}
	
	/**
	 * 查询站点名称是否存在
	 *
	 * @param name
	 * 			站点名称
	 * @return
	 */
	@GetMapping("getWebsiteName")
	public APIResult<String> isWebsiteName(String name){
		List<Integer> count=webSiteService.getWebsiteName(name);
		if(count.get(0)>0){
			return new APIResult<String>(ResultCode.SUCCESS.getCode(),"站点已存在，请重新输入");
		}
		else{
			return new APIResult<String>(ResultCode.SUCCESS.getCode(),"站点名称可用");
		}
	}
	
	/**
	 * 添加站点
	 *
	 * @param tWebsite
	 * 			站点信息（名称、别名、描述、模板id、创建人）
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addWebsite(TWcmWebsite tWebsite){
		int m=webSiteService.addWebsite(tWebsite);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功");
		}
		else{
			return new APIResult<>(ResultCode.FAILURE.getCode(),"添加失败");
		}
	}
	
	/**
	 * 查看站点信息
	 *
	 * @param id
	 *  	 	id
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
	 * 			站点信息（名称、别名、描述、模板id、更新人、站点id）
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
	 * 			id
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
	 * 设置站点的发布状态
	 *
	 * @param tWebsite
	 * 			id、发布人
	 * @return
	 */
	@PostMapping("websitePub")
	public APIResult<String> updateWebsitePub(TWcmWebsite tWebsite){
		int m=webSiteService.updateWebsitePub(tWebsite);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"发布成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"发布失败");
		}
	}
	
	/**
	 * 设置站点的使用状态
	 *
	 * @param tWebsite
	 * 			id、站点使用状态
	 * @return
	 */
	@PostMapping("websiteUse")
	public APIResult<String> updateWebsiteUse(TWcmWebsite tWebsite){
		int m=webSiteService.updateWebsiteUse(tWebsite);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"该站点正在使用");
		}
		else {
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"该站点可使用");
		}
	}
	
	/**
	 * 设置站点模板
	 *
	 * @param id
	 * 			站点id
	 * @param templates_id_index
	 * 			模板id-首页
	 * @return
	 */
	@GetMapping("index")
	public APIResult<String> setWebsiteTemplate(Integer id,Integer templates_id_index){
		int m=webSiteService.setWebsiteTemplates(id, templates_id_index);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"模板设置成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"模板设置失败");
		}
	} 

}

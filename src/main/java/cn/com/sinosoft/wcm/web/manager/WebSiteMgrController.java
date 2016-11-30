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
	@PostMapping("list")
	public APIResult<PagingResult<TWcmWebsite>> getList(String name,
			String alias, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmWebsite>>(
				new PagingResult<TWcmWebsite>());
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
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
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
		return new APIResult<TWcmWebsite>();
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
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
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
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 站点设置首页模板
	 *
	 * @param id
	 * 			模板id-首页
	 * @return
	 */
	@GetMapping("index")
	public APIResult<String> setWebsiteTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 

}

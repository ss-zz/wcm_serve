package cn.com.sinosoft.wcm.web.manager;

import javax.annotation.Resource;

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
	 * 普通分页查询
	 *
	 * @return
	 */
	public APIResult<PagingResult<TWcmWebsite>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmWebsite>>(
				new PagingResult<TWcmWebsite>());
	}
	
	/**
	 * 添加站点
	 *
	 * @param tWebsite
	 * @return
	 */
	public APIResult<String> addWebsite(TWcmWebsite tWebsite){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 查看站点信息
	 *
	 * @param id
	 * @return
	 */
	public APIResult<TWcmWebsite> getDetail(Integer id){
		return new APIResult<TWcmWebsite>();
	}
	
	/**
	 * 修改站点信息
	 *
	 * @param tWebsite
	 * @return
	 */
	public APIResult<String> updateWebsite(TWcmWebsite tWebsite){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	
	/**
	 * 删除站点
	 *
	 * @param id
	 * @return
	 */
	public APIResult<String> deleteWebsite(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 站点设置首页模板
	 *
	 * @param id
	 * @return
	 */
	public APIResult<String> setWebsiteTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 

}

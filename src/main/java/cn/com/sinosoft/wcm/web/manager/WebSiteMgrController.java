package cn.com.sinosoft.wcm.web.manager;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.RequestResult;
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
	public RequestResult<PagingResult<TWcmWebsite>> getList(String params1,
			String params2, PageParam pageParam) {
		return new RequestResult<PagingResult<TWcmWebsite>>(
				new PagingResult<TWcmWebsite>());
	}

}

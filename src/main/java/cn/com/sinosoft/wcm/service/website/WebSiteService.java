package cn.com.sinosoft.wcm.service.website;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.sinosoft.tbf.dao.BaseDao;

/**
 * 站点相关业务
 *
 * @author <a href="mainto:nytclizy@gmail.com">lizhiyong</a>
 * @since 2016年11月29日
 */
@Service
public class WebSiteService {
	
	private static final String NAMESPACE_BASE = "cn.com.sinosoft.wcm.website.";

	@Resource
	BaseDao baseDao;

}

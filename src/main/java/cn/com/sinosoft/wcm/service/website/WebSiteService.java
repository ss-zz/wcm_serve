package cn.com.sinosoft.wcm.service.website;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.sinosoft.tbf.dao.BaseDao;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.wcm.domain.wcm.TWcmWebsite;

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
	
	/**
	 * 站点列表
	 *
	 * @param name
	 * 			站点名称
	 * @param alias
	 * 			站点别名
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	public PagingResult<TWcmWebsite> getListWebsite(String name,String alias,PageParam pageParam){
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("name", name);
		params.put("alias", alias);
		PagingResult<TWcmWebsite> result=baseDao.pagingSearch(NAMESPACE_BASE +"Website_List", params, pageParam);
		return result;
	}
	
	/**
	 * 查询站点名称是否存在
	 *
	 * @param name
	 * 			站点名称
	 * @return 
	 * @return
	 */
	public List<Integer> getWebsiteName(String name){
		List<Integer> count=baseDao.queryList(NAMESPACE_BASE +"Select_Website_Name", name);
		return count.size()>0 ? count :null;
	}
	
	/**
	 * 新建站点
	 *
	 * @param tWebsite
	 * 			新建站点信息
	 * @return
	 */
	public int addWebsite(TWcmWebsite tWebsite){
		
		//设置创建站点的时间
		tWebsite.setCreate_time(new Date());
		//设置发布状态(1表示未发布)
		tWebsite.setPub_state("1");
		int m=baseDao.insert(NAMESPACE_BASE +"Add_Website",tWebsite);
		return m;
	}
	
	/**
	 * 获取站点信息
	 *
	 * @param id
	 * 			站点id
	 * @return
	 */
	public TWcmWebsite getWebsiteDetail(Integer id){
		List<TWcmWebsite> list=baseDao.queryList(NAMESPACE_BASE +"Website_Detail", id);
		return list.size()>0 ? list.get(0) : null ;
	}
	
	/**
	 * 修改站点
	 *
	 * @param tWebsite
	 * 			修改的站点信息
	 * @return
	 */
	public int updateWebsite(TWcmWebsite tWebsite){
		//设置站点更新时间
		tWebsite.setUpdate_time(new Date());
		int m=baseDao.update(NAMESPACE_BASE +"Update_Website", tWebsite);
		return m;
	}
	
	/**
	 * 删除站点
	 *
	 * @param id
	 * 			站点id
	 * @return
	 */
	public int deleteWebsite(Integer id){
		int m=baseDao.delete(NAMESPACE_BASE +"Delete_Website", id);
		return m;
	}
	
	/**
	 * 发布站点
	 *
	 * @param tWebsite
	 * 			设置站点发布状态、发布人、发布时间
	 * @return
	 */
	public int updateWebsitePub(TWcmWebsite tWebsite){
		//设置发布时间
		tWebsite.setPub_time(new Date());
		//设置发布状态
		tWebsite.setPub_state("2");
		int m=baseDao.update(NAMESPACE_BASE +"Update_Website_Pub", tWebsite);
		return m;
	}
	
	/**
	 * 站点使用状态
	 *
	 * @param tWebsite
	 * 			设置站点使用状态
	 * @return
	 */
	public int updateWebsiteUse(TWcmWebsite tWebsite){
		int m=baseDao.update(NAMESPACE_BASE +"Update_Website_Use", tWebsite);
		return m;
	}
	
	/**
	 * 设置站点模板
	 *
	 * @param id
	 * 			站点id
	 * @param templates_id_index
	 * 			模板id
	 * @return
	 */
	public int setWebsiteTemplates(Integer id,Integer templates_id_index){
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("templates_id_index", templates_id_index);
		int m=baseDao.update(NAMESPACE_BASE +"Set_Website_Templates", params);
		return m;
	}

}

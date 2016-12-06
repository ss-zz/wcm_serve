package cn.com.sinosoft.wcm.service.website;

import java.text.SimpleDateFormat;
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
	 */
	public boolean getWebsiteName(String name){
		List<Integer> count=baseDao.queryList(NAMESPACE_BASE +"Website_Name_Select", name);
		if(count.size()>0){
			if(count.get(0)>0){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
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
		tWebsite.setCreateTime(new Date());
		//设置发布状态(1表示未发布)
		tWebsite.setPubState("1");
		//设置创建人
		tWebsite.setCreateUser(baseDao.getUserUtil().getRequestUserLoginName());
		int m=baseDao.insert(NAMESPACE_BASE +"Website_Add",tWebsite);
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
		tWebsite.setUpdateTime(new Date());
		//设置修改人
		tWebsite.setUpdateUser(baseDao.getUserUtil().getRequestUserLoginName());
		int m=baseDao.update(NAMESPACE_BASE +"Website_Update", tWebsite);
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
		int m=baseDao.delete(NAMESPACE_BASE +"Website_Delete", id);
		return m;
	}
	
	/**
	 * 发布站点
	 *
	 * @param id
	 * 			站点id
	 * @param pubUser
	 * 			发布人
	 * @return
	 */
	public int updateWebsitePub(Integer id){
		//设置发布时间
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String pubTime=sdf.format(new Date());
		//设置发布状态(2表示发布)
		String pubState="2";
		//设置发布人
		String pubUser=baseDao.getUserUtil().getRequestUserLoginName();
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("pubUser", pubUser);
		params.put("pubTime", pubTime);
		params.put("pubState", pubState);
		int m=baseDao.update(NAMESPACE_BASE +"Website_Pub_Update", params);
		return m;
	}
	
	/**
	 * 更新站点使用状态
	 *
	 * @param id
	 * 			站点id
	 * @param useState
	 * 			站点使用状态
	 * @return
	 */
	public int updateWebsiteUse(Integer id,String useState){
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("useState", useState);
		int m=baseDao.update(NAMESPACE_BASE +"Website_Use_Update", params);
		return m;
	}
	
	/**
	 * 设置站点模板
	 *
	 * @param id
	 * 			站点id
	 * @param templatesId
	 * 			模板id
	 * @return
	 */
	public int setWebsiteTemplates(Integer id,Integer templatesId){
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("templatesId", templatesId);
		int m=baseDao.update(NAMESPACE_BASE +"Website_Templates_Set", params);
		return m;
	}

}

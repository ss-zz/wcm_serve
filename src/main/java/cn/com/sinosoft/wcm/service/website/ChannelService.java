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
import cn.com.sinosoft.wcm.domain.wcm.TWcmChannel;

/**
 * 栏目相关业务
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-12-2
 */
@Service
public class ChannelService {
	
	private static final String NAMESPACE_BASE = "cn.com.sinosoft.wcm.channel.";
	
	@Resource
	BaseDao baseDao;
	
	/**
	 * 栏目列表
	 *
	 * @param str
	 * 			查询参数（名称、别名）
	 * @param websiteId
	 * 			站点id
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	public PagingResult<TWcmChannel> getListChannel(String str,Integer websiteId,PageParam pageParam){
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("str", str);
		params.put("websiteId", websiteId);
		PagingResult<TWcmChannel> result=baseDao.pagingSearch(NAMESPACE_BASE +"Channel_List", params, pageParam);
		return result;
	}
	
	/**
	 * 查询栏目名称是否存在
	 *
	 * @param name
	 * 			栏目名称
	 * @return 
	 */
	public boolean getChannelName(String name){
		List<Integer> count=baseDao.queryList(NAMESPACE_BASE +"Channel_Name_Select", name);
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
	 * 新建栏目
	 *
	 * @param tChannel
	 * 			新建栏目信息
	 * @return
	 */
	public int addChannel(TWcmChannel tChannel){
		
		//设置创建站点的时间
		tChannel.setCreateTime(new Date());
		//设置发布状态(1表示未发布)
		tChannel.setPubState("1");
		//设置创建人
		tChannel.setCreateUser(baseDao.getUserUtil().getRequestUserLoginName());
		int m=baseDao.insert(NAMESPACE_BASE +"Channel_Add",tChannel);
		return m;
	}
	
	/**
	 * 获取栏目信息
	 *
	 * @param id
	 * 			栏目id
	 * @return
	 */
	public TWcmChannel getChannelDetail(Integer id){
		List<TWcmChannel> list=baseDao.queryList(NAMESPACE_BASE +"Channel_Detail", id);
		return list.size()>0 ? list.get(0) : null ;
	}
	
	/**
	 * 修改栏目
	 *
	 * @param tChannel
	 * 			修改的栏目信息
	 * @return
	 */
	public int updateChannel(TWcmChannel tChannel){
		//设置站点更新时间
		tChannel.setUpdateTime(new Date());
		//设置修改人
		tChannel.setUpdateUser(baseDao.getUserUtil().getRequestUserLoginName());
		int m=baseDao.update(NAMESPACE_BASE +"Channel_Update", tChannel);
		return m;
	}
	
	/**
	 * 删除栏目
	 *
	 * @param id
	 * 			栏目id
	 * @return
	 */
	public int deleteChannel(Integer id){
		int m=baseDao.delete(NAMESPACE_BASE +"Channel_Delete", id);
		return m;
	}
	
	/**
	 * 发布栏目
	 *
	 * @param id
	 * 			栏目id
	 * @param pubUser
	 * 			发布人
	 * @return
	 */
	public int updateChannelPub(Integer id){
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
		int m=baseDao.update(NAMESPACE_BASE +"Channel_Pub_Update", params);
		return m;
	}
	
	/**
	 * 更新栏目使用状态
	 *
	 * @param id
	 * 			栏目id
	 * @param useState
	 * 			栏目使用状态
	 * @return
	 */
	public int updateChannelUse(Integer id,String useState){
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("useState", useState);
		int m=baseDao.update(NAMESPACE_BASE +"Channel_Use_Update", params);
		return m;
	}
	
	/**
	 * 设置栏目首页模板
	 *
	 * @param id
	 * 			栏目id
	 * @param templatesIdIndex
	 * 			模板id
	 * @return
	 */
	public int setChannelIndexTemplates(Integer id,Integer templatesIdIndex){
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("templatesIdIndex", templatesIdIndex);
		int m=baseDao.update(NAMESPACE_BASE +"Channel_Templates_Index_Set", params);
		return m;
	}

	
	/**
	 * 设置栏目列表页模板
	 *
	 * @param id
	 * 			栏目id
	 * @param templatesIdList
	 * 			模板id
	 * @return
	 */
	public int setChannelListTemplates(Integer id,Integer templatesIdList){
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("templatesIdList", templatesIdList);
		int m=baseDao.update(NAMESPACE_BASE +"Channel_Templates_List_Set", params);
		return m;
	}

	
	/**
	 * 设置栏目详情页模板
	 *
	 * @param id
	 * 			栏目id
	 * @param templatesIdDetail
	 * 			模板id
	 * @return
	 */
	public int setChannelDetailTemplates(Integer id,Integer templatesIdDetail){
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("id", id);
		params.put("templatesIdDetail", templatesIdDetail);
		int m=baseDao.update(NAMESPACE_BASE +"Channel_Templates_Detail_Set", params);
		return m;
	}

}

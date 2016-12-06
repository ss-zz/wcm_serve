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
import cn.com.sinosoft.wcm.domain.wcm.TWcmArticle;

/**
 * 文章相关业务
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-12-6
 */
@Service
public class ArticleService {
	
	private static final String NAMESPACE_BASE="cn.com.sinosoft.wcm.doc.";
	
	@Resource
	BaseDao baseDao;
	
	/**
	 * 文章列表
	 *
	 * @param channelId
	 * 			栏目id
	 * @param websiteId
	 * 			站点id
	 * @param title
	 * 			文章标题
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	public PagingResult<TWcmArticle> getDocList(Integer channelId,Integer websiteId,String title,PageParam pageParam){
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("channelId", channelId);
		params.put("websiteId", websiteId);
		params.put("title", title);
		PagingResult<TWcmArticle> result=baseDao.pagingSearch(NAMESPACE_BASE +"Doc_List_Get", params, pageParam);
		return result;
	}
	
	/**
	 * 添加文章
	 *
	 * @param tWcmArticle
	 * 			文章信息
	 * @return
	 */
	public int addDoc(TWcmArticle tWcmArticle){
		//设置创建时间
		tWcmArticle.setCreateTime(new Date());
		//设置创建人
		tWcmArticle.setCreateUser(baseDao.getUserUtil().getRequestUserLoginName());
		int m=baseDao.insert(NAMESPACE_BASE +"Doc_Add", tWcmArticle);
		return m;
	}
	
	/**
	 * 更新文章
	 *
	 * @param tWcmArticle
	 * 			文章信息
	 * @return
	 */
	public int updateDoc(TWcmArticle tWcmArticle){
		//设置更新时间
		tWcmArticle.setUpdateTime(new Date());
		//设置更新人
		tWcmArticle.setUpdateUser(baseDao.getUserUtil().getRequestUserLoginName());
		int m=baseDao.update(NAMESPACE_BASE + "Doc_Update", tWcmArticle);
		return m;
	}
	
	/**
	 * 删除文章
	 *
	 * @param id
	 * 		文章id
	 * @return
	 */
	public int deleteDoc(Integer id){
		int m=baseDao.delete(NAMESPACE_BASE +"Doc_delete", id);
		return m;
	}
	
	/**
	 * 根据id获取文章信息
	 *
	 * @param id
	 * 			文章id
	 * @return
	 */
	public TWcmArticle getDetailDoc(Integer id){
		List<TWcmArticle> list=baseDao.queryList(NAMESPACE_BASE +"Doc_Detail_GetById", id);
		return list.size()>0 ? list.get(0) : null;
	}
}

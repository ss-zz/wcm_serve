package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmChannel;

/**
 * 栏目管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/channel")
public class ChannelMgrController {
	
	
	/**
	 * 普通分页查询
	 *
	 * @return
	 */
	public APIResult<PagingResult<TWcmChannel>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmChannel>>(
				new PagingResult<TWcmChannel>());
	}
	
	/**
	 * 添加栏目
	 *
	 * @param tChannel
	 * @return
	 */
	public APIResult<String> addChannel(TWcmChannel tChannel){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除栏目
	 *
	 * @param tChannel
	 * @return
	 */
	public APIResult<String> deleteChannel(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取栏目信息
	 *
	 * @param id
	 * @return
	 */
	public APIResult<TWcmChannel> getChannel(Integer id){
		return new APIResult<TWcmChannel>();
	}
	
	/**
	 * 修改栏目信息
	 *
	 * @param tChannel
	 * @return
	 */
	public APIResult<String> updateChannel(TWcmChannel tChannel){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	
	/**
	 * 栏目设置列表模板
	 *
	 * @param id
	 * @return
	 */
	public APIResult<String> setListTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 
	
	/**
	 * 栏目设置详情页模板
	 *
	 * @param id
	 * @return
	 */
	public APIResult<String> setDetailTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 
	
	/**
	 * 栏目设置首页模板
	 *
	 * @param id
	 * @return
	 */
	public APIResult<String> setIndexTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 

}

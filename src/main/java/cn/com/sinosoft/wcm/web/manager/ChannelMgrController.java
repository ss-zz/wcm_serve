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
import cn.com.sinosoft.wcm.domain.wcm.TWcmChannel;
import cn.com.sinosoft.wcm.service.website.ChannelService;

/**
 * 栏目管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/channel")
public class ChannelMgrController {
	
	@Resource
	ChannelService channelService;
	
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
	@PostMapping("list")
	public APIResult<PagingResult<TWcmChannel>> getList(String str,Integer websiteId, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmChannel>>(
				channelService.getListChannel(str, websiteId, pageParam));
	}
	
	/**
	 * 添加栏目
	 *
	 * @param tChannel
	 * 			栏目信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addChannel(TWcmChannel tChannel){
		if(channelService.getChannelName(tChannel.getName())){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"该栏目名已存在");
		}
		else{
			int m=channelService.addChannel(tChannel);
			if(m>0){
				return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功");
			}
			else {
				return new APIResult<>(ResultCode.FAILURE.getCode(),"添加失败");
			}
		}
	}
	
	/**
	 * 根据id获取栏目详细信息
	 *
	 * @param id
	 *  	 	栏目id
	 * @return
	 */
	@GetMapping("detail")
	public APIResult<TWcmChannel> getDetail(Integer id){
		return new APIResult<TWcmChannel>(channelService.getChannelDetail(id));
	}
	
	/**
	 * 修改栏目信息
	 *
	 * @param tChannel
	 * 			栏目信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateChannel(TWcmChannel tChannel){
		int m=channelService.updateChannel(tChannel);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"修改失败");
		}
	}
	
	/**
	 * 删除栏目
	 *
	 * @param id
	 * 			栏目id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteChannel(Integer id){
		int m=channelService.deleteChannel(id);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"删除失败");
		}
	}
	
	/**
	 * 栏目发布
	 *
	 * @param id
	 * 			栏目id
	 * @return
	 */
	@PostMapping("pubChannel")
	public APIResult<String> updateChannelPub(Integer id){
		int m=channelService.updateChannelPub(id);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"发布成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"发布失败");
		}
	}
	
	/**
	 * 更新站点的使用状态
	 *
	 * @param id
	 * 			站点id
	 * @param useState
	 * 			使用状态
	 * @return
	 */
	@PostMapping("useChannel")
	public APIResult<String> updateChannelUse(Integer id,String useState){
		int m=channelService.updateChannelUse(id,useState);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"使用状态更新成功");
		}
		else {
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"使用状态更新失败");
		}
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
	@GetMapping("setIndexTemplates")
	public APIResult<String> setIndexTemplate(Integer id,Integer templatesIdIndex){
		int m=channelService.setChannelIndexTemplates(id, templatesIdIndex);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"模板设置成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"模板设置失败");
		}
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
	@GetMapping("setListTemplates")
	public APIResult<String> setListTemplate(Integer id,Integer templatesIdList){
		int m=channelService.setChannelListTemplates(id, templatesIdList);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"模板设置成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"模板设置失败");
		}
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
	@GetMapping("setDetailTemplates")
	public APIResult<String> setDetailTemplate(Integer id,Integer templatesIdDetail){
		int m=channelService.setChannelDetailTemplates(id, templatesIdDetail);
		if(m>0){
			return new APIResult<>(ResultCode.SUCCESS.getCode(),"模板设置成功");
		}
		else {
			return new APIResult<>(ResultCode.FAILURE.getCode(),"模板设置失败");
		}
	} 
	
}

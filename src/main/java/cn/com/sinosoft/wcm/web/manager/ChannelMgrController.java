package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	 * 
	 *
	 * @param params1
	 * 			参数1
	 * @param params2
	 * 			参数2
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@PostMapping("list")
	public APIResult<PagingResult<TWcmChannel>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmChannel>>(
				new PagingResult<TWcmChannel>());
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
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除栏目
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteChannel(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取栏目信息
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("get/detail")
	public APIResult<TWcmChannel> getChannel(Integer id){
		return new APIResult<TWcmChannel>();
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
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	
	/**
	 * 栏目设置列表模板
	 *
	 * @param id
	 * 			列表模板id
	 * @return
	 */
	@GetMapping("template/list")
	public APIResult<String> setListTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 
	
	/**
	 * 栏目设置详情页模板
	 *
	 * @param id
	 * 			详细模板id
	 * @return
	 */
	@GetMapping("template/detail")
	public APIResult<String> setDetailTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 
	
	/**
	 * 栏目设置首页模板
	 *
	 * @param id
	 * 			首页模板id
	 * @return
	 */
	@GetMapping("template/index")
	public APIResult<String> setIndexTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"设置成功！");
	} 

}

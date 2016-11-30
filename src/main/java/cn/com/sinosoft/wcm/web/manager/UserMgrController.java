package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmUser;

/**
 * 用户管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/user")
public class UserMgrController {
	
	/**
	 * 
	 *
	 * @param loginName
	 * 			登录名
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@PostMapping("list")
	public APIResult<PagingResult<TWcmUser>> getList(String loginName,PageParam pageParam) {
		return new APIResult<PagingResult<TWcmUser>>(
				new PagingResult<TWcmUser>());
	}
	
	/**
	 * 添加用户
	 *
	 * @param tUser
	 * 			用户信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addUser(TWcmUser tUser){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除用户
	 *
	 * @param id 
	 * 			id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteUser(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取登录用户信息
	 *
	 * @param loginName
	 * 			登录名
	 * @return
	 */
	@PostMapping("get/detail")
	public APIResult<TWcmUser> getUser(String loginName){
		return new APIResult<TWcmUser>();
	}
	
	/**
	 * 修改用户信息
	 *
	 * @param tUser
	 * 			用户信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateUser(TWcmUser tUser){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	
	/**
	 * 修改用户密码
	 *
	 * @param oldPwd
	 * 			旧密码
	 * @param newPwd
	 * 			新密码
	 * @return
	 */
	@PostMapping("update/pass")
	public APIResult<String> updateUserPwd(String oldPwd, String newPwd){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	} 
	
	/**
	 * 修改用户权限
	 *
	 * @param state
	 * 			用户权限
	 * @return
	 */
	@PostMapping("state")
	public APIResult<String> updateUserLimit(String state){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	} 
	
}

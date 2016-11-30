package cn.com.sinosoft.wcm.web.manager;

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
	 * 普通分页查询
	 *
	 * @return
	 */
	public APIResult<PagingResult<TWcmUser>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmUser>>(
				new PagingResult<TWcmUser>());
	}
	
	/**
	 * 添加用户
	 *
	 * @param tUser
	 * @return
	 */
	public APIResult<String> addUser(TWcmUser tUser){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除用户
	 *
	 * @param tUser
	 * @return
	 */
	public APIResult<String> deleteUser(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取登录用户信息
	 *
	 * @param loginName
	 * @return
	 */
	public APIResult<TWcmUser> getUser(String loginName){
		return new APIResult<TWcmUser>();
	}
	
	/**
	 * 修改用户信息
	 *
	 * @param tUser
	 * @return
	 */
	public APIResult<String> updateUser(TWcmUser tUser){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	
	/**
	 * 修改用户密码
	 *
	 * @param oldPwd
	 * @param newPwd
	 * @return
	 */
	public APIResult<String> updateUserPwd(String oldPwd, String newPwd){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	} 
	
	/**
	 * 修改用户权限
	 *
	 * @param state
	 * @return
	 */
	public APIResult<String> updateUserLimit(String state){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	} 
	
}

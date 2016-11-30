package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmPub;

/**
 * 文章管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/pub")
public class PubMgrController {
	
	/**
	 * 普通分页查询
	 *
	 * @return
	 */
	public APIResult<PagingResult<TWcmPub>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmPub>>(
				new PagingResult<TWcmPub>());
	}
	
	/**
	 * 发布页面（）
	 *
	 * @param tPub
	 * @return
	 */
	public APIResult<String> addPub(TWcmPub tPub){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"发布成功！");
	}
	
	/**
	 * 删除页面
	 *
	 * @param tPub
	 * @return
	 */
	public APIResult<String> deletePub(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 预览页面
	 *
	 * @param id
	 * @return
	 */
	public APIResult<TWcmPub> getPub(Integer id){
		return new APIResult<TWcmPub>();
	}
	
	/**
	 * 修改页面
	 *
	 * @param tPub
	 * @return
	 */
	public APIResult<String> updatePub(TWcmPub tPub){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}
	

}

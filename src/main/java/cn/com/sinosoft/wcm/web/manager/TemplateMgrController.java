package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmTemplate;


/**
 * 模板管理控制器
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016-11-30
 */
@RestController
@RequestMapping("mgr/template")
public class TemplateMgrController {
	
	
	
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
	public APIResult<PagingResult<TWcmTemplate>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmTemplate>>(
				new PagingResult<TWcmTemplate>());
	}
	
	/**
	 * 新建模板
	 *
	 * @param tTemplate
	 * 			模板信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addTemplate(TWcmTemplate tTemplate){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除模板
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteTemplate(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 预览模板
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("get/detail")
	public APIResult<TWcmTemplate> getTemplate(Integer id){
		return new APIResult<TWcmTemplate>();
	}
	
	/**
	 * 修改模板
	 *
	 * @param tTemplate
	 * 			模板信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateTemplate(TWcmTemplate tTemplate){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}

}

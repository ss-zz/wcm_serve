package cn.com.sinosoft.wcm.web.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.tbf.domain.common.APIResult;
import cn.com.sinosoft.tbf.domain.common.PageParam;
import cn.com.sinosoft.tbf.domain.common.PagingResult;
import cn.com.sinosoft.tbf.domain.common.ResultCode;
import cn.com.sinosoft.wcm.domain.wcm.TWcmFile;


@RestController
@RequestMapping("mgr/file")
public class FileMgrController {
	
	
	/**
	 * 
	 *
	 * @param name
	 * 			文件名
	 * @param pageParam
	 * 			分页参数
	 * @return
	 */
	@PostMapping("list")
	public APIResult<PagingResult<TWcmFile>> getList(String name,PageParam pageParam) {
		return new APIResult<PagingResult<TWcmFile>>(
				new PagingResult<TWcmFile>());
	}
	
	/**
	 * 添加文件
	 *
	 * @param tFile
	 * 			文件信息
	 * @return
	 */
	@PostMapping("add")
	public APIResult<String> addFile(TWcmFile tFile){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除文件
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("delete")
	public APIResult<String> deleteFile(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取文件
	 *
	 * @param id
	 * 			id
	 * @return
	 */
	@GetMapping("get/detail")
	public APIResult<TWcmFile> getFile(Integer id){
		return new APIResult<TWcmFile>();
	}
	
	/**
	 * 修改文件
	 *
	 * @param tFile
	 * 			文件信息
	 * @return
	 */
	@PostMapping("edit")
	public APIResult<String> updateFile(TWcmFile tFile){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}

}

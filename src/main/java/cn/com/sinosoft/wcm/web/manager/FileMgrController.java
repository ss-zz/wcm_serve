package cn.com.sinosoft.wcm.web.manager;

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
	 * 普通分页查询
	 *
	 * @return
	 */
	public APIResult<PagingResult<TWcmFile>> getList(String params1,
			String params2, PageParam pageParam) {
		return new APIResult<PagingResult<TWcmFile>>(
				new PagingResult<TWcmFile>());
	}
	
	/**
	 * 添加文件
	 *
	 * @param tFile
	 * @return
	 */
	public APIResult<String> addFile(TWcmFile tFile){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"添加成功！");
	}
	
	/**
	 * 删除文件
	 *
	 * @param tFile
	 * @return
	 */
	public APIResult<String> deleteFile(Integer id){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"删除成功！");
	}
	
	/**
	 * 获取文件
	 *
	 * @param id
	 * @return
	 */
	public APIResult<TWcmFile> getFile(Integer id){
		return new APIResult<TWcmFile>();
	}
	
	/**
	 * 修改文件
	 *
	 * @param tFile
	 * @return
	 */
	public APIResult<String> updateFile(TWcmFile tFile){
		return new APIResult<>(ResultCode.SUCCESS.getCode(),"修改成功！");
	}

}

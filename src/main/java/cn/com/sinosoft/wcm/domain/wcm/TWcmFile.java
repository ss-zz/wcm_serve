package cn.com.sinosoft.wcm.domain.wcm;

import java.util.Date;

public class TWcmFile {
	
	/**
	 * 文件id 
	 */
	private Integer id;
	
	/**
	 * 文件名称
	 */
	private String name;
	
	/**
	 * 文件描述
	 */
	private String describe;
	
	/**
	 * 文件类型
	 */
	private String type;
	
	/**
	 * 文件大小
	 */
	private String size;
	
	/**
	 * 文件存储路径
	 */
	private String path;
	/**
	 * 创建时间
	 */
	private Date create_time;
	
	/**
	 * 创建人
	 */
	private String create_user;
	
	/**
	 * 更新时间
	 */
	private Date update_time;
	
	/**
	 * 更新人
	 */
	private String update_user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
}

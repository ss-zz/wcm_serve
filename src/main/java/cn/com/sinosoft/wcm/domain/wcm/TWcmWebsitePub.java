package cn.com.sinosoft.wcm.domain.wcm;

import java.util.Date;

public class TWcmWebsitePub {
	
	/**
	 * 站点发布表id
	 */
	private Integer id;
	/**
	 * 站点id
	 */
	private Integer website_id;
	/**
	 * 发布类型
	 */
	private String type;
	/**
	 * 发布地址
	 */
	private String address;
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

	public Integer getWebsite_id() {
		return website_id;
	}

	public void setWebsite_id(Integer website_id) {
		this.website_id = website_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

package cn.com.sinosoft.wcm.domain.wcm;

import java.util.Date;

/**
 * 站点信息表
 *
 * @author <a href="mainto:nytclizy@gmail.com">lizhiyong</a>
 * @since 2016年11月30日
 */
public class TWcmWebsite {

	/**
	 * 站点id
	 */
	private Integer id;
	
	/**
	 * 站点名称
	 */
	private String name;
	
	/**
	 * 站点别名
	 */
	private String alias;
	
	/**
	 * 站点描述
	 */
	private String describe;
	
	/**
	 * 栏目模板id-首页
	 */
	private Integer templates_id_index;
	
	/**
	 * 站点使用状态
	 */
	private String use_state;
	
	/**
	 * 站点发布状态
	 */
	private String pub_state;
	
	/**
	 * 站点发布时间
	 */
	private Date pub_time;
	
	/**
	 * 发布人
	 */
	private String pub_user;
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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Integer getTemplates_id_index() {
		return templates_id_index;
	}

	public void setTemplates_id_index(Integer templates_id_index) {
		this.templates_id_index = templates_id_index;
	}

	public String getUse_state() {
		return use_state;
	}

	public void setUse_state(String use_state) {
		this.use_state = use_state;
	}

	public String getPub_state() {
		return pub_state;
	}

	public void setPub_state(String pub_state) {
		this.pub_state = pub_state;
	}

	public Date getPub_time() {
		return pub_time;
	}

	public void setPub_time(Date pub_time) {
		this.pub_time = pub_time;
	}

	public String getPub_user() {
		return pub_user;
	}

	public void setPub_user(String pub_user) {
		this.pub_user = pub_user;
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

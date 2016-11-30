package cn.com.sinosoft.wcm.domain.wcm;

import java.util.Date;

public class TWcmChannel {
	/**
	 * 栏目id
	 */
	private Integer id;
	
	/**
	 * 父栏目id
	 */
	private Integer parent_id;
	
	/**
	 * 站点id
	 */
	private Integer website_id;
	
	/**
	 * 栏目名称
	 */
	private String name;
	
	/**
	 * 栏目别名
	 */
	private String alias;
	
	/**
	 * 栏目类型
	 */
	private String type;
	
	/**
	 *栏目内容类型
	 */
	private String content_type;
	
	/**
	 * 栏目描述
	 */
	private String describe;
	
	/**
	 * 栏目logo
	 */
	private String logo;
	
	/**
	 * 栏目模板id-首页
	 */
	private Integer templates_id_index;
	
	/**
	 * 栏目模板id-列表页
	 */
	private Integer templates_id_list;
	
	/**
	 * 栏目模板id-详细页
	 */
	private Integer templates_id_detail;
	
	/**
	 * 列表页文档数
	 */
	private Integer list_documnets;
	
	/**
	 * 列表页最大更新分页数
	 */
	private Integer list_pages;
	
	/**
	 * 栏目使用状态
	 */
	private String use_state;
	
	/**
	 * 栏目发布状态
	 */
	private String pub_state;
	
	/**
	 * 栏目发布时间
	 */
	private Date pub_time;
	
	/**
	 * 栏目发布人
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

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public Integer getWebsite_id() {
		return website_id;
	}

	public void setWebsite_id(Integer website_id) {
		this.website_id = website_id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getTemplates_id_index() {
		return templates_id_index;
	}

	public void setTemplates_id_index(Integer templates_id_index) {
		this.templates_id_index = templates_id_index;
	}

	public Integer getTemplates_id_list() {
		return templates_id_list;
	}

	public void setTemplates_id_list(Integer templates_id_list) {
		this.templates_id_list = templates_id_list;
	}

	public Integer getTemplates_id_detail() {
		return templates_id_detail;
	}

	public void setTemplates_id_detail(Integer templates_id_detail) {
		this.templates_id_detail = templates_id_detail;
	}

	public Integer getList_documnets() {
		return list_documnets;
	}

	public void setList_documnets(Integer list_documnets) {
		this.list_documnets = list_documnets;
	}

	public Integer getList_pages() {
		return list_pages;
	}

	public void setList_pages(Integer list_pages) {
		this.list_pages = list_pages;
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

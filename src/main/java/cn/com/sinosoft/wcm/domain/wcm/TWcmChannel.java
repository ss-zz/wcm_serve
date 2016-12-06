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
	private Integer parentId;
	
	/**
	 * 站点id
	 */
	private Integer websiteId;
	
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
	private String contentType;
	
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
	private Integer templatesIdIndex;
	
	/**
	 * 栏目模板id-列表页
	 */
	private Integer templatesIdList;
	
	/**
	 * 栏目模板id-详细页
	 */
	private Integer templatesIdDetail;
	
	/**
	 * 列表页文档数
	 */
	private Integer listDocuments;
	
	/**
	 * 列表页最大更新分页数
	 */
	private Integer listPages;
	
	/**
	 * 栏目使用状态
	 */
	private String useState;
	
	/**
	 * 栏目发布状态
	 */
	private String pubState;
	
	/**
	 * 栏目发布时间
	 */
	private Date pubTime;
	
	/**
	 * 栏目发布人
	 */
	private String pubUser;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 创建人
	 */
	private String createUser;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 更新人
	 */
	private String updateUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(Integer websiteId) {
		this.websiteId = websiteId;
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

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
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

	public Integer getTemplatesIdIndex() {
		return templatesIdIndex;
	}

	public void setTemplatesIdIndex(Integer templatesIdIndex) {
		this.templatesIdIndex = templatesIdIndex;
	}

	public Integer getTemplatesIdList() {
		return templatesIdList;
	}

	public void setTemplatesIdList(Integer templatesIdList) {
		this.templatesIdList = templatesIdList;
	}

	public Integer getTemplatesIdDetail() {
		return templatesIdDetail;
	}

	public void setTemplatesIdDetail(Integer templatesIdDetail) {
		this.templatesIdDetail = templatesIdDetail;
	}

	public Integer getListDocuments() {
		return listDocuments;
	}

	public void setListDocuments(Integer listDocuments) {
		this.listDocuments = listDocuments;
	}

	public Integer getListPages() {
		return listPages;
	}

	public void setListPages(Integer listPages) {
		this.listPages = listPages;
	}

	public String getUseState() {
		return useState;
	}

	public void setUseState(String useState) {
		this.useState = useState;
	}

	public String getPubState() {
		return pubState;
	}

	public void setPubState(String pubState) {
		this.pubState = pubState;
	}

	public Date getPubTime() {
		return pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public String getPubUser() {
		return pubUser;
	}

	public void setPubUser(String pubUser) {
		this.pubUser = pubUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}

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
	private Integer templatesId;
	
	/**
	 * 站点使用状态
	 */
	private String useState;
	
	/**
	 * 站点发布状态
	 */
	private String pubState;
	
	/**
	 * 站点发布时间
	 */
	private Date pubTime;
	
	/**
	 * 发布人
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

	public Integer getTemplatesId() {
		return templatesId;
	}

	public void setTemplatesId(Integer templatesId) {
		this.templatesId = templatesId;
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

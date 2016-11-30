package cn.com.sinosoft.wcm.domain.wcm;

public class TWcmUser {
	
	/**
	 * 用户id
	 */
	private Integer id;
	
	/**
	 * 登录名
	 */
	private String login_name;
	
	/**
	 * 昵称
	 */
	private String user_name;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 性别
	 */
	private String sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}

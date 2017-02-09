package com.song.mybatis.beans;

import java.io.Serializable;

/**
 * <p>
 * Title: mybatis_[Bean]_[模块名]
 * </p>
 * <p>
 * Description: [Bean]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月9日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public class AccountBean implements Serializable {

	/**
	 * 默认
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String username;

	private String password;

	private Double account;

	public AccountBean() {
	}

	public AccountBean(String username, String password, Double account) {
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public AccountBean(Integer id, String username, String password, Double account) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "AccountBean [id=" + id + ", username=" + username + ", password=" + password + ", account=" + account
				+ "]";
	}

}

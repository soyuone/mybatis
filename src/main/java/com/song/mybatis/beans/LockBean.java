package com.song.mybatis.beans;

import java.util.List;

/**
 * <p>
 * Title: mybatis_[Bean]_[模块名]
 * </p>
 * <p>
 * Description: [Bean]
 * </p>
 * 
 * @author SO
 * @version $Revision$ 2017年2月12日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public class LockBean {

	private Integer id;

	private String lock_name;

	private List<KeyBean> keys;

	public LockBean() {
	}

	public LockBean(Integer id, String lock_name, List<KeyBean> keys) {
		this.id = id;
		this.lock_name = lock_name;
		this.keys = keys;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLock_name() {
		return lock_name;
	}

	public void setLock_name(String lock_name) {
		this.lock_name = lock_name;
	}

	public List<KeyBean> getKeys() {
		return keys;
	}

	public void setKeys(List<KeyBean> keys) {
		this.keys = keys;
	}

	@Override
	public String toString() {
		return "LockBean [id=" + id + ", lock_name=" + lock_name + ", keys=" + keys + "]";
	}

}

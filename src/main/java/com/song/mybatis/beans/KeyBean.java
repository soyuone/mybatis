package com.song.mybatis.beans;

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
public class KeyBean {

	private Integer id;

	private String key_name;

	private LockBean lock;

	public KeyBean() {
	}

	public KeyBean(Integer id, String key_name, LockBean lock) {
		this.id = id;
		this.key_name = key_name;
		this.lock = lock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKey_name() {
		return key_name;
	}

	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}

	public LockBean getLock() {
		return lock;
	}

	public void setLock(LockBean lock) {
		this.lock = lock;
	}

	@Override
	public String toString() {
		return "KeyBean [id=" + id + ", key_name=" + key_name + ", lock=" + lock + "]";
	}

}

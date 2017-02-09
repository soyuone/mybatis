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
public class HusbandBean implements Serializable {

	/**
	 * 默认
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private WifeBean wife;

	public HusbandBean() {
	}

	public HusbandBean(Integer id, String name, WifeBean wife) {
		this.id = id;
		this.name = name;
		this.wife = wife;
	}

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

	public WifeBean getWife() {
		return wife;
	}

	public void setWife(WifeBean wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "HusbandBean [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}

}

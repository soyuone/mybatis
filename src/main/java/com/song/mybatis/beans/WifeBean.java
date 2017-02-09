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
public class WifeBean implements Serializable {

	/**
	 * 默认
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private HusbandBean husband;

	public WifeBean() {
	}

	public WifeBean(Integer id, String name, HusbandBean husband) {
		this.id = id;
		this.name = name;
		this.husband = husband;
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

	public HusbandBean getHusband() {
		return husband;
	}

	public void setHusband(HusbandBean husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "WifeBean [id=" + id + ", name=" + name + ", husband=" + husband + "]";
	}

}

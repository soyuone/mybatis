package com.song.mybatis.beans;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Title: mybatis_[Bean]_[模块名]
 * </p>
 * <p>
 * Description: [Bean]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月14日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public class StudentBean implements Serializable {

	/**
	 * 默认
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private List<CourseBean> courseList;

	public StudentBean() {
	}

	public StudentBean(Integer id, String name, List<CourseBean> courseList) {
		this.id = id;
		this.name = name;
		this.courseList = courseList;
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

	public List<CourseBean> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseBean> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", courseList=" + courseList + "]";
	}

}

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
public class CourseBean implements Serializable {

	/**
	 * 默认
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private List<StudentBean> studentList;

	public CourseBean() {
	}

	public CourseBean(Integer id, String name, List<StudentBean> studentList) {
		this.id = id;
		this.name = name;
		this.studentList = studentList;
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

	public List<StudentBean> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentBean> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "CourseBean [id=" + id + ", name=" + name + ", studentList=" + studentList + "]";
	}

}

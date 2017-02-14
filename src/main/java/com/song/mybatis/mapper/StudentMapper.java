package com.song.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.song.mybatis.beans.StudentBean;

public interface StudentMapper {

	/**
	 * <p>
	 * Description:[根据ID查询学生信息]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public StudentBean getStudentById(@Param("id") int id) throws Exception;

	/**
	 * <p>
	 * Description:[查找学生时同时将选学生所选的课程一并查出]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public StudentBean getStuAndCou(@Param("id") int id) throws Exception;
}

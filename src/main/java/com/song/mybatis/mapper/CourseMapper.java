package com.song.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.song.mybatis.beans.CourseBean;

public interface CourseMapper {

	/**
	 * <p>
	 * Description:[根据ID查询课程]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public CourseBean getCourseById(@Param("id") int id) throws Exception;

	/**
	 * <p>
	 * Description:[查课时同时将选该课的学生一并查出]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public CourseBean getCouAndStu(@Param("id") int id) throws Exception;

}

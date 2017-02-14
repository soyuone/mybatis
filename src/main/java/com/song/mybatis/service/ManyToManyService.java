package com.song.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.CourseBean;
import com.song.mybatis.beans.StudentBean;
import com.song.mybatis.mapper.CourseMapper;
import com.song.mybatis.mapper.StudentMapper;
import com.song.mybatis.util.SessionFactory;

public class ManyToManyService {

	public static void main(String[] args) {
		// getStudentById(1);
		// getStuAndCou(1);
		// getCourseById(1);
		getCouAndStu(1);

	}

	/**
	 * <p>
	 * Description:[根据ID查询学生信息s]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getStudentById(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		try {
			StudentBean stu = mapper.getStudentById(id);
			System.out.println(stu);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[查找学生时同时将选学生所选的课程一并查出]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getStuAndCou(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		try {
			StudentBean stu = mapper.getStuAndCou(id);
			System.out.println(stu);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[根据ID查询课程]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getCourseById(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
		try {
			CourseBean course = mapper.getCourseById(id);
			System.out.println(course);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[查课时同时将选该课的学生一并查出]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getCouAndStu(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
		try {
			CourseBean course = mapper.getCouAndStu(id);
			System.out.println(course);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
}

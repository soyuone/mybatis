package com.song.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.HusbandBean;
import com.song.mybatis.beans.WifeBean;
import com.song.mybatis.mapper.HusbandMapper;
import com.song.mybatis.mapper.WifeMapper;
import com.song.mybatis.util.SessionFactory;

public class OneToOneService {

	public static void main(String[] args) {
		// insertHusband("赵三");
		// insertWife("孙三", 1);
		// getHusbandById(2);
		getHusbandAndWife(1);
	}

	/**
	 * <p>
	 * Description:[新增Husband]
	 * </p>
	 * Created by [songyushi] [2017年2月10日] Midified by [修改人] [修改时间]
	 *
	 * @param name
	 */
	private static void insertHusband(String name) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		HusbandMapper mapper = sqlSession.getMapper(HusbandMapper.class);
		HusbandBean husband = new HusbandBean(name);
		try {
			mapper.insertHusband(husband);
			System.out.println("INSERT SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[新增Wife]
	 * </p>
	 * Created by [songyushi] [2017年2月10日] Midified by [修改人] [修改时间]
	 *
	 * @param name
	 * @param fk_husband_id
	 */
	private static void insertWife(String name, int fk_husband_id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		WifeMapper mapper = sqlSession.getMapper(WifeMapper.class);
		WifeBean wife = new WifeBean(name, fk_husband_id);
		try {
			int num = mapper.insertWife(wife);
			System.out.println("INSERT SUCCESS: ");
			System.out.println("NUM: " + num);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[根据主键ID查询Husband]
	 * </p>
	 * Created by [songyushi] [2017年2月10日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getHusbandById(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		HusbandMapper mapper = sqlSession.getMapper(HusbandMapper.class);
		try {
			HusbandBean husband = mapper.getHusbandById(id);
			System.out.println("GET SUCCESS: ");
			System.out.println(husband.toString());
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[查询Husband和Wife]
	 * </p>
	 * Created by [songyushi] [2017年2月10日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getHusbandAndWife(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		HusbandMapper mapper = sqlSession.getMapper(HusbandMapper.class);
		try {
			HusbandBean husband = mapper.getHusbandAndWife(id);
			System.out.println("GET SUCCESS: ");
			System.out.println(husband.toString());
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
}

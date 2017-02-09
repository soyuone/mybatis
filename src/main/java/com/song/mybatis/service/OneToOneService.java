package com.song.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.mapper.HusbandMapper;
import com.song.mybatis.util.SessionFactory;

public class OneToOneService {

	public static void main(String[] args) {
		insertHusband("赵四");
	}

	private static void insertHusband(String name) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		HusbandMapper mapper = sqlSession.getMapper(HusbandMapper.class);
//		HusbandBean husbandBean = new HusbandBean(name);
		try {
			mapper.insertHusband(name);
			System.out.println("INSERT SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	private static void getHusbandAndWife() {

	}
}

package com.song.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.KeyBean;
import com.song.mybatis.beans.LockBean;
import com.song.mybatis.mapper.KeyMapper;
import com.song.mybatis.mapper.LockMapper;
import com.song.mybatis.util.SessionFactory;

public class OneToManyService {
	public static void main(String[] args) {
		saveLock(new LockBean("通天锁"));
	}

	private static void saveLock(LockBean lock) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		LockMapper mapper = sqlSession.getMapper(LockMapper.class);
		try {
			int num = mapper.saveLock(lock);
			System.out.println("INSERT SUCCESS: ");
			System.out.println("NUM: " + num);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	private static void batchSaveKeys(List<KeyBean> keys) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		KeyMapper mapper = sqlSession.getMapper(KeyMapper.class);
		try {
			int num = mapper.batchSaveKeys(keys);
			System.out.println("INSERT SUCCESS: ");
			System.out.println("NUM: " + num);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
}

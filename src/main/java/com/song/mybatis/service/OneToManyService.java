package com.song.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.KeyBean;
import com.song.mybatis.beans.LockBean;
import com.song.mybatis.mapper.KeyMapper;
import com.song.mybatis.mapper.LockMapper;
import com.song.mybatis.util.SessionFactory;

public class OneToManyService {
	public static void main(String[] args) {
		// saveLock(new LockBean("通天锁"));
		// batchSaveKeys();
		findLockAndKeys(1);
	}

	/**
	 * <p>
	 * Description:[新增Lock]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 *
	 * @param lock
	 */
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

	/**
	 * <p>
	 * Description:[批量添加钥匙]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 */
	private static void batchSaveKeys() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		LockMapper lockMapper = sqlSession.getMapper(LockMapper.class);
		KeyMapper mapper = sqlSession.getMapper(KeyMapper.class);
		try {
			System.out.println("GET LOCK: ");
			LockBean lock = lockMapper.findLockById(1);
			System.out.println("LOCK: " + lock.toString());

			List<KeyBean> keys = new ArrayList<KeyBean>();
			for (int i = 0; i < 5; i++) {
				KeyBean key = new KeyBean(null, "钥匙" + i, lock);
				keys.add(key);
			}
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

	/**
	 * <p>
	 * Description:[根据锁ID查找锁及钥匙信息]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void findLockAndKeys(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		LockMapper mapper = sqlSession.getMapper(LockMapper.class);
		try {
			LockBean lock = mapper.findLockAndKeys(id);
			System.out.println(lock);
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
}

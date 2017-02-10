package com.song.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.AccountBean;
import com.song.mybatis.mapper.AccountMapper;
import com.song.mybatis.util.SessionFactory;

public class AccountService {

	public static void main(String[] args) {
		// insertAccount("汤姆", "123456", 10.12);
		// deleteAccount(1);

		// 对比insertAccount时传入的accountBean，update时参数有错
		// updateAccount(new AccountBean("杉达", "111111", 11.11), 2);
		// getAccountById(2);
		getAllAccount();
	}

	/**
	 * <p>
	 * Description:[新增]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 */
	private static void insertAccount(String username, String password, Double account) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		AccountBean accountBean = new AccountBean(username, password, account);
		try {
			mapper.insertAccount(accountBean);
			System.out.println("INSERT SUCCESS: " + accountBean.toString());
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[删除]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void deleteAccount(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		try {
			mapper.deleteAccount(id);
			System.out.println("DELETE SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[修改]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param AccountBean
	 * @param id
	 */
	private static void updateAccount(AccountBean AccountBean, int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		try {
			mapper.updateAccount(AccountBean, id);
			System.out.println("UPDATE SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[根据ID查询Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 */
	private static void getAccountById(int id) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		try {
			AccountBean accountBean = mapper.getAccountById(id);
			System.out.println("GET SUCCESS: ");
			System.out.println(accountBean.toString());
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[查询所有]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 */
	private static void getAllAccount() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		try {
			List<AccountBean> listBean = mapper.getAllAccount();
			System.out.println("GET SUCCESS: ");
			System.out.println(listBean.toString());
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

}

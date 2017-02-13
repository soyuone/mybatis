package com.song.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.AccountBean;
import com.song.mybatis.mapper.AccountMapper;
import com.song.mybatis.util.SessionFactory;

public class AccountService {

	public static void main(String[] args) {
		// insertAccount("刘能", "2017", 10.12);
		// deleteAccount(6);

		// 对比insertAccount时传入的accountBean，update时参数有错
		// updateAccount(new AccountBean("杉达", "1111", 11.11), 4);
		// getAccountById(4);
		// getAllAccount();
		// countAccount();
		// getAccountByPage();
		// batchInsertAccount();
		batchDeleteAccount();
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

	/**
	 * <p>
	 * Description:[根据姓名模糊查询]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 */
	private static void countAccount() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		// 根据name模糊查询
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", "Tom");
		try {
			int num = mapper.countAccount(paramMap);
			System.out.println("记录数量：" + num);
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[分页查询Account]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 */
	private static void getAccountByPage() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", "Tom");
		paramMap.put("index", 0);// 从第几记录开始，mysql从0开始
		paramMap.put("pageSize", 5);// 每页显示条数
		try {
			List<AccountBean> listResult = mapper.getAccountByPage(paramMap);
			for (AccountBean account : listResult) {
				System.out.println(account);
			}
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <p>
	 * Description:[批量插入]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 */
	private static void batchInsertAccount() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

		List<AccountBean> listAccount = new ArrayList<AccountBean>();
		for (int i = 0; i < 10; i++) {
			AccountBean account = new AccountBean("Kitty" + i, "2000", 12.13);
			listAccount.add(account);
		}
		try {
			mapper.batchInsertAccount(listAccount);
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
	 * Description:[批量删除]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 */
	private static void batchDeleteAccount() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

		List<Integer> ids = new ArrayList<Integer>();
		for (int i = 18; i < 21; i++) {
			ids.add(i);
		}
		try {
			mapper.batchDeleteAccount(ids);
			System.out.println("DELETE SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
}

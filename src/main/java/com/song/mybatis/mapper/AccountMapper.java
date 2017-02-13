package com.song.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.song.mybatis.beans.AccountBean;

public interface AccountMapper {

	/**
	 * <p>
	 * Description:[新增Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param account
	 * @return
	 */
	public int insertAccount(@Param("a") AccountBean account);

	/**
	 * <p>
	 * Description:[修改Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param account
	 * @param id
	 * @return
	 */
	public int updateAccount(@Param("a") AccountBean account, @Param("id") Integer id);

	/**
	 * <p>
	 * Description:[删除Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public int deleteAccount(@Param("id") Integer id);

	/**
	 * <p>
	 * Description:[根据ID查询Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public AccountBean getAccountById(@Param("id") Integer id);

	/**
	 * <p>
	 * Description:[查询所有Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public List<AccountBean> getAllAccount();

	/**
	 * <p>
	 * Description:[批量添加]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 *
	 * @param accounts
	 * @return
	 */
	public int batchInsertAccount(@Param("accounts") List<AccountBean> accounts) throws Exception;

	/**
	 * <p>
	 * Description:[批量删除]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 *
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public int batchDeleteAccount(@Param("ids") List<Integer> ids) throws Exception;

	/**
	 * <p>
	 * Description:[分页查询Account]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 *
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public List<AccountBean> getAccountByPage(Map<String, Object> paramMap) throws Exception;

	/**
	 * <p>
	 * Description:[根据name模糊查询符合条件的记录数量]
	 * </p>
	 * Created by [songyushi] [2017年2月13日] Midified by [修改人] [修改时间]
	 *
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public int countAccount(Map<String, Object> paramMap) throws Exception;
}

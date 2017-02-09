package com.song.mybatis.mapper;

import java.util.List;

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
	public int insertAccount(AccountBean account);

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
	public int updateAccount(AccountBean account, Integer id);

	/**
	 * <p>
	 * Description:[删除Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public int deleteAccount(Integer id);

	/**
	 * <p>
	 * Description:[根据ID查询Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public AccountBean getAccountById(Integer id);

	/**
	 * <p>
	 * Description:[查询所有Account]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public List<AccountBean> getAllAccount();
}

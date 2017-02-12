package com.song.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.song.mybatis.beans.LockBean;

public interface LockMapper {

	/**
	 * <p>
	 * Description:[添加锁]
	 * </p>
	 * Created by [SO] [2017年2月12日] Midified by [修改人] [修改时间]
	 *
	 * @param lock
	 * @return
	 */
	public int saveLock(@Param("lock") LockBean lock);

	/**
	 * <p>
	 * Description:[根据ID查询锁的资料]
	 * </p>
	 * Created by [SO] [2017年2月12日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public LockBean findLockById(int id);

	/**
	 * <p>
	 * Description:[根据ID查询锁与钥匙的资料]
	 * </p>
	 * Created by [SO] [2017年2月12日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public LockBean findLockAndKeys(int id);
}

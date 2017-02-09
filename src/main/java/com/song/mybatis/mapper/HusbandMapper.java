package com.song.mybatis.mapper;

import com.song.mybatis.beans.HusbandBean;

public interface HusbandMapper {

	/**
	 * <p>
	 * Description:[新增Husband]
	 * </p>
	 * Created by [SO] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param husband
	 * @return
	 */
	public int insertHusband(String name);

	/**
	 * <p>
	 * Description:[根据ID查询Husband]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public HusbandBean getHusbandById(int id);

	/**
	 * <p>
	 * Description:[根据ID查询Husband和Wife]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public HusbandBean getHusbandAndWife(int id);
}

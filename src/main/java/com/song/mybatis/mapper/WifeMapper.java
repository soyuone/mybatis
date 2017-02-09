package com.song.mybatis.mapper;

import com.song.mybatis.beans.WifeBean;

public interface WifeMapper {

	/**
	 * <p>
	 * Description:[由Husband ID查询Wife]
	 * </p>
	 * Created by [songyushi] [2017年2月9日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public WifeBean getWifeByHusbandId(int id);
	
}

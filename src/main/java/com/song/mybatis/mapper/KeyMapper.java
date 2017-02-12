package com.song.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.song.mybatis.beans.KeyBean;

public interface KeyMapper {

	/**
	 * <p>
	 * Description:[批量添加钥匙.提倡这样使用@Param("keys"),区别于Spring MVC框架的@RequestParam]
	 * </p>
	 * Created by [SO] [2017年2月12日] Midified by [修改人] [修改时间]
	 *
	 * @param keys
	 * @return
	 */
	public int batchSaveKeys(@Param("keys") List<KeyBean> keys);

}

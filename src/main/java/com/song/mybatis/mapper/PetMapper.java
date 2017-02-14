package com.song.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.song.mybatis.beans.CatBean;
import com.song.mybatis.beans.DogBean;
import com.song.mybatis.beans.PetBean;

public interface PetMapper {

	/**
	 * <p>
	 * Description:[添加宠物猫]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param cat
	 * @return
	 */
	public int saveCat(@Param("cat") CatBean cat);

	/**
	 * <p>
	 * Description:[添加宠物狗]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @param dog
	 * @return
	 */
	public int saveDog(@Param("dog") DogBean dog);

	/**
	 * <p>
	 * Description:[查询所有宠物]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public List<PetBean> findAllPet();

	/**
	 * <p>
	 * Description:[查询所有的宠物猫]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public List<CatBean> findAllCat();
}

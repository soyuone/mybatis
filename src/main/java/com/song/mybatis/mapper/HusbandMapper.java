package com.song.mybatis.mapper;

import com.song.mybatis.beans.HusbandBean;

//MyBatis实际是对xml进行操作，我们所有的方法都直接定义在xml中，添加此接口只是为了更好的符合三层的思想
//若不写接口，直接通过session也可以直接操作xml中的方法；xml中只要有方法就可以使用，调用方式：namespace+方法名。
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
	public int insertHusband(HusbandBean husband);

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

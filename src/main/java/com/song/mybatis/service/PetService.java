package com.song.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.song.mybatis.beans.CatBean;
import com.song.mybatis.beans.DogBean;
import com.song.mybatis.beans.PetBean;
import com.song.mybatis.mapper.PetMapper;
import com.song.mybatis.util.SessionFactory;

public class PetService {

	public static void main(String[] args) {
		// saveCat();
		// saveDog();
		// findAllCat();
		findAllPet();
	}

	/**
	 * <p>
	 * Description:[添加宠物猫]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 */
	public static void saveCat() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		PetMapper mapper = sqlSession.getMapper(PetMapper.class);

		try {
			CatBean cat = new CatBean(null, "哆啦A梦");
			cat.setFish(10);
			mapper.saveCat(cat);
			System.out.println("SAVE SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[添加宠物狗]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 */
	public static void saveDog() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		PetMapper mapper = sqlSession.getMapper(PetMapper.class);
		try {
			DogBean dog = new DogBean(null, "秋田犬");
			dog.setBone(10);
			mapper.saveDog(dog);
			System.out.println("SAVE SUCCESS: ");
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[查找所有的宠物猫]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 */
	public static void findAllCat() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		PetMapper mapper = sqlSession.getMapper(PetMapper.class);
		try {
			List<CatBean> listCat = mapper.findAllCat();
			for (CatBean cat : listCat) {
				System.out.println(cat);
			}
			sqlSession.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}

	/**
	 * <p>
	 * Description:[查找所有宠物]
	 * </p>
	 * Created by [songyushi] [2017年2月14日] Midified by [修改人] [修改时间]
	 */
	public static void findAllPet() {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		PetMapper mapper = sqlSession.getMapper(PetMapper.class);
		try {
			List<PetBean> pets = mapper.findAllPet();
			for (PetBean pet : pets) {
				System.out.println(pet);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}

	}

}

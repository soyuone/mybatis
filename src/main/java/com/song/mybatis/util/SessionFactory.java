package com.song.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	public static SqlSessionFactory sqlSessionFactory;

	static {
		try {
			// 使用MyBatis提供的Resources类加载mybatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
			// 构建sqlSession的工厂
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 创建能执行映射文件中sql的sqlSession
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}

}

package com.song.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * <p>
 * Title: mybatis_[SqlSessionFactory工具类]_[模块名]
 * </p>
 * <p>
 * Description: [SqlSessionFactory工具类]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月13日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
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

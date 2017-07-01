package com.study.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.mybatis.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyMybatisApplicationTests {
	@Autowired
	BeanFactory beanFactory;

	@Autowired
	SqlSessionFactory sessionFactory;
	
	@Test
	public void testSqlSessionFactory(){
		System.out.println(beanFactory.getBean(JdbcTemplate.class)==null);
	}
	
	@Test
	public void contextLoads() {
		System.out.println(beanFactory.getBean(DataSource.class)==null);
		System.out.println(beanFactory.getBean(UserMapper.class)==null);
	}

}

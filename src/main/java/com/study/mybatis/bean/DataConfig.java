package com.study.mybatis.bean;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataConfig {
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage("com.study.mybatis.dao");
		configurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		return configurer;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean;
	}

	@Bean(initMethod = "init", destroyMethod = "close")
	@ConfigurationProperties(prefix = "db")
	public DataSource dataSource() throws PropertyVetoException {
		DruidDataSource db = new DruidDataSource();
		return db;
	}
}

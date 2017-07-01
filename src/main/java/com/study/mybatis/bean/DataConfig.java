package com.study.mybatis.bean;

import javax.sql.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class DataConfig {
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage("com.study.mybatis.mapper");
		configurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		return configurer;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean;
	}

	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
		return transactionManager;
	}
}

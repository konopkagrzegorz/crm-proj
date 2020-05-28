package com.luv2.code.spring.crm.project.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="com.luv2.code.spring.crm.*")
@PropertySource("classpath:persistence-mysql.properties")
public class MainConfig implements WebMvcConfigurer {
	
	@Autowired
	private Environment enviroment;
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public DataSource dataSource() throws RuntimeException {
		
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		 try {
			 dataSource.setDriverClass(enviroment.getProperty("jdbc.driver"));		 
		} catch (PropertyVetoException e) {
			System.out.println(e.getMessage());
		}
		 dataSource.setJdbcUrl(enviroment.getProperty("jdbc.url"));
		 dataSource.setUser(enviroment.getProperty("jdbc.user"));
		 dataSource.setPassword(enviroment.getProperty("jdbc.password"));
		 dataSource.setInitialPoolSize(convertStringToInteger(enviroment.getProperty("connection.pool.initialPoolSize")));
		 dataSource.setMinPoolSize(convertStringToInteger(enviroment.getProperty("connection.pool.minPoolSize")));
		 dataSource.setMaxPoolSize(convertStringToInteger(enviroment.getProperty("connection.pool.maxPoolSize")));
		 dataSource.setMaxIdleTime(convertStringToInteger(enviroment.getProperty("connection.pool.maxPoolSize")));
		 return dataSource;
	}
	
	private int convertStringToInteger(String integer) {
		
		int number = Integer.parseInt(integer);
		return number;
	}
}

package com.lagou;

import com.lagou.pojo.Company;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XieLangxin
 * @date 2022/1/4
 */
@Configuration
public class SpringConfig {
	@Bean
	public Company company(){
		Company company = new Company();
		company.setId(1);
		company.setName("lagou");
		return company;
	}

	@Bean
	public BeanPostProcessor beanPostProcessor(){
		return new MyBeanPostProcessor();
	}

	@Bean
	public BeanFactoryPostProcessor beanFactoryPostProcessor(){
		return new MyBeanFactoryPostProcessor();
	}
}

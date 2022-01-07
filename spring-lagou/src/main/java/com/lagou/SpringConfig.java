package com.lagou;

import com.lagou.pojo.Company;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author XieLangxin
 * @date 2022/1/4
 */
@ComponentScan({"com.lagou.service","com.lagou.utils"})
@EnableAspectJAutoProxy
@Configuration
public class SpringConfig {
	//@Bean
	//public Company company(){
	//	Company company = new Company();
	//	company.setId(1);
	//	company.setName("lagou");
	//	return company;
	//}

	//@Bean
	//public BeanPostProcessor beanPostProcessor(){
	//	return new MyBeanPostProcessor();
	//}
	//
	//@Bean
	//public BeanFactoryPostProcessor beanFactoryPostProcessor(){
	//	return new MyBeanFactoryPostProcessor();
	//}
}

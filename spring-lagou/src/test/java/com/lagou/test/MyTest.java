package com.lagou.test;

import com.lagou.SpringConfig;
import com.lagou.pojo.Company;
import com.lagou.service.MyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XieLangxin
 * @date 2022/1/4
 */
public class MyTest {
	@Test
	public void xmlTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Company bean = applicationContext.getBean(Company.class);
		System.out.println(bean);
	}

	@Test
	public void annoTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Company bean = applicationContext.getBean(Company.class);
		System.out.println(bean);
	}

	//@Autowired
	//MyService myService;
	@Test
	public void transactionTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		MyService bean = applicationContext.getBean(MyService.class);
		bean.printHelloWorld();
	}
}

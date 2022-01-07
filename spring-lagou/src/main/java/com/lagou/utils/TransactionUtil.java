package com.lagou.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author XieLangxin
 * @date 2022/1/7
 */
@Component
@Aspect
public class TransactionUtil {
	@Pointcut("execution(public void com.lagou.service.impl.MyServiceImpl.printHelloWorld())")
	public void pt1(){}
	
	@Before("pt1")
	public void before(){
		System.out.println("事务开始");
	}
}

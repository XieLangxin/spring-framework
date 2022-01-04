package com.lagou;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @author XieLangxin
 * @date 2022/1/4
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor(){
		System.out.println("Bean的后置处理器初始化完成");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean的后置处理器调用Before");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean的后置处理器调用After");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}

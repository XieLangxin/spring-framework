package com.lagou.service.impl;

import com.lagou.service.CompanyService;
import com.lagou.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XieLangxin
 * @date 2022/1/7
 */
@Service("beanB")
public class MyServiceImpl implements MyService {
	@Autowired
	CompanyService companyService;

	public MyServiceImpl() {
		System.out.println("执行MyService构造函数∂");
	}

	@Override
	public void printHelloWorld() {
		System.out.println("HelloWorld");
	}
}

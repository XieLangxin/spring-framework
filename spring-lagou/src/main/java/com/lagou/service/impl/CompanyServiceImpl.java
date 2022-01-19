package com.lagou.service.impl;

import com.lagou.service.CompanyService;
import com.lagou.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XieLangxin
 * @date 2022/1/19
 */
@Service("beanA")
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	MyService myService;

	public CompanyServiceImpl() {
		System.out.println("执行CompanyService构造函数");
	}
}

package com.lagou.service.impl;

import com.lagou.service.MyService;
import org.springframework.stereotype.Service;

/**
 * @author XieLangxin
 * @date 2022/1/7
 */
@Service
public class MyServiceImpl implements MyService {
	@Override
	public void printHelloWorld() {
		System.out.println("HelloWorld");
	}
}

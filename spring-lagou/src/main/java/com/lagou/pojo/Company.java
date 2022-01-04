package com.lagou.pojo;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author XieLangxin
 * @date 2022/1/4
 */
@Data
public class Company implements InitializingBean {
	Integer id;
	String name;
	public Company(){
		System.out.println("调用了Company构造函数");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Company属性设置完毕");
	}
}

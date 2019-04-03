package com.example.spring.demo.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("--------start---------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.err.println("容器初始化成功");
		MyTestBean myTestBean = applicationContext.getBean("myTestBean",MyTestBean.class);
		System.err.println(myTestBean.toString());
		System.err.println("关闭容器");
		((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();;
		System.out.println("--------end---------");
	}
}

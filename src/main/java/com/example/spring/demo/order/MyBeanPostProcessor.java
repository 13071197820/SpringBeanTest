package com.example.spring.demo.order;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		super();
		System.out.println("[MyBeanPostProcessor] 构造方法执行");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[MyBeanPostProcessor] postProcessBeforeInitialization()执行, 对属性进行更改");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[MyBeanPostProcessor] postProcessAfterInitialization()执行, 对属性进行更改");
		return bean;
	}

}

package com.example.spring.demo.order;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

	public MyInstantiationAwareBeanPostProcessor() {
		super();
		System.out.println("[MyInstantiationAwareBeanPostProcessor] 构造方法执行");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException{
		System.out.println("[MyInstantiationAwareBeanPostProcessor] 调用 postProcessBeforeInstantiation()执行");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException{
		System.out.println("[MyInstantiationAwareBeanPostProcessor] 调用 postProcessAfterInstantiation()执行");
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(
			PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException{
		System.out.println("[MyInstantiationAwareBeanPostProcessor] 调用 postProcessPropertyValues()执行");
		return pvs;
	}

}

package com.example.spring.demo.order;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public MyBeanFactoryPostProcessor() {
		super();
		System.out.println("[MyBeanFactoryPostProcessor] 实例化");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("myTestBean");
		beanDefinition.getPropertyValues().addPropertyValue("value","4201");
		System.out.println("[MyBeanFactoryPostProcessor] 调用 postProcessBeanFactory()方法");
	}
}

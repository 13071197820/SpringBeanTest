package com.example.spring.demo.order;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import java.util.StringJoiner;

/**
 *
 *  自己的Bean
 *  field  key  value
 *
 *  method  setter toString
 *
 *  implements   BeanNameAware ,
 *               BeanFactoryAware,
 *               InitializingBean,
 *               DisposableBean
 */
public class MyTestBean implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{

	private String key;
	private String value;

	private String beanName;
	private BeanFactory beanFactory;

	public void setKey(String key) {
		System.out.println("### 执行[MyTestBean] key属性[setter方法] ###");
		this.key = key;
	}
	public void setValue(String value) {
		System.out.println("### 执行[MyTestBean] value属性[setter方法] ###");
		this.value = value;
	}
	@Override
	public String toString() {
		System.out.println("### 执行[MyTestBean] [toString()方法] ###");
		return new StringJoiner(", ", MyTestBean.class.getSimpleName() + "[", "]")
				.add("key='" + key + "'")
				.add("value='" + value + "'")
				.toString();
	}
	public MyTestBean() {
		super();
		System.out.println("### 执行[MyTestBean] [构造方法] ###");
	}
	/**
	 * init-method属性指定
	 */
	public void MyInitMethod(){
		System.out.println("### 执行[MyTestBean] init-method属性指定的 MyInitMethod() ###");
	}
	/**
	 * destroy-method 属性指定
	 */
	public void MyDestroyMethod(){
		System.out.println("### 执行[MyTestBean] destroy-method属性指定的 MyDestroyMethod() ###");
	}

	/**
	 * 来自BeanNameAware接口
	 * @param s beanName
	 */
	@Override
	public void setBeanName(String s) {
		System.out.println(String.format("[BeanNameAware] 执行 setBeanName(%s)方法",s));
		this.beanName = s;
	}

	/**
	 * 来自BeanFactoryAware接口
	 * @param beanFactory
	 * @throws BeansException
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(String.format("[BeanFactoryAware] 执行 setBeanFactory(%s)方法",beanFactory));
		this.beanFactory = beanFactory;
	}

	/**
	 * 来自InitializingBean接口
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[InitializingBean] 执行 afterPropertiesSet()方法");
	}


	/**
	 * 来自DisposableBean接口
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("[DisposableBean] 执行 destroy()方法");
	}


}

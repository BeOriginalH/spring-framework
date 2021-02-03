package com.harvey.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author harvey
 * @date 2021/2/3
 */
public class ModifyStudentAgeBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered{

	private int order;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("=========修改age==========");
		BeanDefinition student = beanFactory.getBeanDefinition("student");
		student.getPropertyValues().addPropertyValue("age", "10");

	}

	public void setOrder(int order) {

		this.order = order;
	}

	@Override
	public int getOrder() {

		return order;
	}

}

package com.harvey.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author harvey
 * @date 2021/2/3
 */
public class ModifyStudentNameBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered{

	private int order;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("=========修改name==========");
		BeanDefinition student = beanFactory.getBeanDefinition("student");
		student.getPropertyValues().addPropertyValue("name", "harvey");

	}

	public void setOrder(int order) {

		this.order = order;
	}

	@Override
	public int getOrder() {

		return order;
	}
}

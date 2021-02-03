package com.harvey.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author harvey
 * @date 2021/2/3
 */
public class StudentBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered{

	private int order;

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		System.out.println("=============create student1 beanDefinition ============");
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(Student.class);
		registry.registerBeanDefinition("student1", beanDefinitionBuilder.getBeanDefinition());
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("=========modify student1 name ==========");
		BeanDefinition student1 = beanFactory.getBeanDefinition("student1");
		student1.getPropertyValues().addPropertyValue("name", "student1");
	}

	public void setOrder(int order) {

		this.order = order;
	}

	@Override
	public int getOrder() {

		return order;
	}
}


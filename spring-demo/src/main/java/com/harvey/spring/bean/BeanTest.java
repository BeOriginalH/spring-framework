package com.harvey.spring.bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-01-27
 */
public class BeanTest {

	@Test
	public void simpleBeanTest() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beantest/simple-bean.xml");
		SimpleBean simpleBean = applicationContext.getBean(SimpleBean.class);
		System.out.println(simpleBean.getName());

	}

	@Test
	public void importBeanTest() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beantest/import-bean.xml");
		SimpleBean importBean1 = (SimpleBean) applicationContext.getBean("importBean1");
		System.out.println(importBean1.getName());
		SimpleBean importBean2 = (SimpleBean) applicationContext.getBean("importBean2");
		System.out.println(importBean2.getName());

	}

	@Test
	public void beansBeanTest() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beantest/beans-bean.xml");
		SimpleBean beansBean1 = (SimpleBean) applicationContext.getBean("beansBean1");
		System.out.println(beansBean1.getName());
		SimpleBean beansBean2 = (SimpleBean) applicationContext.getBean("beansBean2");
		System.out.println(beansBean2.getName());

	}

	@Test
	public void aliasBeanTest() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beantest/alias-bean.xml");
		SimpleBean beansBean1 = (SimpleBean) applicationContext.getBean("simpleBean");
		System.out.println(beansBean1.getName());
		SimpleBean beansBean2 = (SimpleBean) applicationContext.getBean("simpleBean2");
		System.out.println(beansBean2.getName());

	}

	@Test
	public void idNameRepeatBean() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beantest/id-name-repeat-bean.xml");
		SimpleBean beansBean1 = (SimpleBean) applicationContext.getBean("simpleBean");
		System.out.println(beansBean1.getName());
		SimpleBean beansBean2 = (SimpleBean) applicationContext.getBean("simpleBean");
		System.out.println(beansBean2.getName());

	}
}

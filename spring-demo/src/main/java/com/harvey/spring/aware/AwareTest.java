package com.harvey.spring.aware;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-03-16
 */
public class AwareTest {

	@Test
	public void BeanNameAwareTest() {


		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aware/bean_name_aware.xml");
		BeanNameAwareTest bean = applicationContext.getBean(BeanNameAwareTest.class);
		System.out.println(bean.getName());

	}


}

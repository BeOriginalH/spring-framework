package com.harvey.spring.factory;

import com.harvey.spring.bean.SimpleBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-01-27
 */
public class BeanTest{

	@Test
	public void factoryBeanTest() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beantest/factory-bean.xml");
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car.getName());

	}

}

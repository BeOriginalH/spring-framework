package com.harvey.spring.bean.placehoder;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-01-13
 */
public class PropertiesTest {

	public static void main(String[] args) {

		System.setProperty("spring.name", "test");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/placeholder/${spring.name}-spring.xml");

		ConfigurableEnvironment environment = context.getEnvironment();
		String property = environment.getProperty("spring.name");
		System.out.println(property);

		String m2_home = environment.getProperty("M2_HOME");
		System.out.println(m2_home);


	}
}

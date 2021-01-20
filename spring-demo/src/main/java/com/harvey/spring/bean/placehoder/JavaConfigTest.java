package com.harvey.spring.bean.placehoder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-01-13
 */
public class JavaConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

		ConfigurableEnvironment environment = configApplicationContext.getEnvironment();

		System.out.println(environment.getProperty("password"));
	}
}

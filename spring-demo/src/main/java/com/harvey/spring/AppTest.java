package com.harvey.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2020-08-19
 */
public class AppTest {


	@Test
	public void test1() {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.harvey.spring");
		TestBean testBean = applicationContext.getBean(TestBean.class);
		System.out.println(testBean.getName());

	}

	@Test
	public void test2() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("placeholder/test-spring.xml");
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student.getName());
	}

	@Test
	public void test3(){

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("placeholder/test-spring.xml");

	}


}

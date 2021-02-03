package com.harvey.spring.processor;

import com.harvey.spring.bean.SimpleBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author harvey
 * @date 2021/2/3
 */
public class ProcessorBeanTest{

	@Test
	public void simpleBeanTest() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beantest/bean-factory-processor-bean.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getName());

		Student student1 = (Student) applicationContext.getBean("student1");
		System.out.println(student1.getName());

	}

}

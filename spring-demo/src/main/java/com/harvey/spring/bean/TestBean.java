package com.harvey.spring.bean;

import org.springframework.stereotype.Service;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2020-08-19
 */
@Service
public class TestBean {

	private String name = "harvey";

	public TestBean(String name) {
		this.name = name;
	}

	public TestBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

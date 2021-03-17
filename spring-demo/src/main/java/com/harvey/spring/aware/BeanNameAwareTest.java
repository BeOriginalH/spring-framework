package com.harvey.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-03-16
 */
public class BeanNameAwareTest implements BeanNameAware {

	private String name;

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

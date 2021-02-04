package com.harvey.spring.factory;

/**
 * @author harvey
 * @date 2021/2/4
 */
public class Car{

	private String name;

	private String price;

	public static Car createCar() {

		Car car = new Car();
		car.setName("car1");
		car.setPrice("100");
		return car;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getPrice() {

		return price;
	}

	public void setPrice(String price) {

		this.price = price;
	}
}

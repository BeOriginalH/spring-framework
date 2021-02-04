package com.harvey.spring.factory;

/**
 * @author harvey
 * @date 2021/2/4
 */
public class CarFactory{

	public  Car createCar(String carName,String price) {

		Car car = new Car();
		car.setName(carName);
		car.setPrice(price);
		return car;
	}

}

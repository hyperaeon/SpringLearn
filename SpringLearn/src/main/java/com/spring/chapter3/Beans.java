package com.spring.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

	@Bean(name="car")
	public Car buildCar(){
		Car car = new Car();
		car.setBrand("hongqi");
		car.setColor("Red");
		car.setMaxSpeed(230);
		return car;
	}
}

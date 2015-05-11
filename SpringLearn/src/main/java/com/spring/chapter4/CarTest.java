package com.spring.chapter4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/spring/chapter4/beans.xml");
		Car car = (Car)ctx.getBean("car");
		System.out.println(car.getbRAnd());
	}

}

package com.spring.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KennyTest {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		Instrumentalist list = (Instrumentalist) ctx.getBean("kenny");
		list.perform();
	}
}

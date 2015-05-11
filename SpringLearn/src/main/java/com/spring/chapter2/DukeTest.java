package com.spring.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DukeTest {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");
		Performer perform = (Performer) context.getBean("duke");
		perform.perform();
		
		perform = (Performer) context.getBean("poeticDuke");
		perform.perform();
	}
}

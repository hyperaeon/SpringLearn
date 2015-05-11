package com.spring.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MangicianTest {

	@Test
	public void magicianShouldReadVolunteersMind() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/spring/chapter4/spring-chapter4.xml");
		Volunteer volunteer = (Volunteer) context.getBean("volunteer");
		volunteer.thinkOfSomething("Queen of Hearts");
		Magician magician = (Magician) context.getBean("magician");
		assertEquals("Queen of Hearts", magician.getThoughts());
	}
}

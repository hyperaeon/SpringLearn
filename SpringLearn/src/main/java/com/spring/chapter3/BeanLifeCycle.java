package com.spring.chapter3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycle {

	public static void LifeCycleInBeanFactory(){
		Resource res = new ClassPathResource("com/spring/chapter3/beansLife.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		((ConfigurableBeanFactory)factory).addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory)factory).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		CarBean car1 = (CarBean)factory.getBean("car");
		car1.introduce();
		car1.setColor("ºìÉ«");
		
		CarBean car2 = (CarBean)factory.getBean("car");
		System.out.println("car1 == car2 ? " + (car1 == car2));
		((XmlBeanFactory)factory).destroySingletons();
	}
	public static void main(String[] args) {
		LifeCycleInBeanFactory();
	}

}

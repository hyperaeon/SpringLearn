package com.spring.chapter3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class BeanFactoryTest {

	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:com/spring/chapter3/beans.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		System.out.println("Init Bean Factory");
		Car car = (Car) bf.getBean("car");
		System.out.println("car: " + car);
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:com/spring/chapter3/beans.xml");
		Car car2 = (Car)ctx.getBean("car");
		System.out.println("car2: " + car);
	}

}

package com.spring.chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("car")){
			CarBean car = (CarBean)bean;
			if(car.getColor() == null){
				System.out.println("调用MyBeanPostProcessor.postProcessBeforeInitialization,color为空，设置为默认色");
				car.setColor("黑色");
			}
		}
		CarBean car2 = (CarBean)bean;
		System.out.println("postProcessBeforeInitialization中设置的颜色：" + car2.getColor());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("car")){
			CarBean car = (CarBean)bean;
			if(car.getMaxSpeed() > 200){
				System.out.println("调用MyBeanPostProcessor.postProcessAfterInitialization,速度大于200默认为200");
				car.setMaxSpeed(200);
			}
		}
		return bean;
	}

}

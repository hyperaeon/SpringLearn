package com.spring.chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("car")){
			CarBean car = (CarBean)bean;
			if(car.getColor() == null){
				System.out.println("����MyBeanPostProcessor.postProcessBeforeInitialization,colorΪ�գ�����ΪĬ��ɫ");
				car.setColor("��ɫ");
			}
		}
		CarBean car2 = (CarBean)bean;
		System.out.println("postProcessBeforeInitialization�����õ���ɫ��" + car2.getColor());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("car")){
			CarBean car = (CarBean)bean;
			if(car.getMaxSpeed() > 200){
				System.out.println("����MyBeanPostProcessor.postProcessAfterInitialization,�ٶȴ���200Ĭ��Ϊ200");
				car.setMaxSpeed(200);
			}
		}
		return bean;
	}

}

package com.spring.chapter3;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends
		InstantiationAwareBeanPostProcessorAdapter {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if ("car".equals(beanName)) {
			System.out
					.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInitialization");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName)
			throws BeansException {
		if ("car".equals(beanName)) {
			System.out
					.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object bean, String beanName)
			throws BeansException {
		if ("car".equals(beanName)) {
			System.out
					.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues");
		}
		return pvs;
	}
	
	

}

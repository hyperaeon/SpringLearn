package com.spring.chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CarBean implements BeanNameAware, BeanFactoryAware,
		InitializingBean, DisposableBean {

	private String brand;
	
	private String color;
	
	private int maxSpeed;
	
	private BeanFactory beanFactory;
	
	private String beanName;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public CarBean(){
		System.out.println("����CarBean�Ĺ��캯��������");
	}
	
	public void setBrand(String brand){
		System.out.println("setBrand	������");
		this.brand = brand;
	}
	
	public void introduce(){
		System.out.println("brand:" + brand + "; color:" + color + "; maxSpeed:" + maxSpeed);
	}

	//BeanFactoryAware�ӿڷ���
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("����BeanFactoryAware.setBeanFactory������");
		this.beanFactory = beanFactory;

	}

	//BeanNameAware�ӿڷ���
	public void setBeanName(String name) {
		System.out.println("����BeanNameAware.setBeanName������");
		this.beanName = name;

	}
	
	//InitializingBean�ӿڷ���
	public void afterPropertiesSet() throws Exception {
		System.out.println("����InitializingBean.afterPropertiesSet������");

	}
	
	//DisposableBean�ӿڷ���
	public void destroy() throws Exception {
		System.out.println("����DisposableBean.destroy������");

	}
	
	public void myInit(){
		System.out.println("����myInit������");
		this.maxSpeed = 200;
	}
	
	public void myDestroy(){
		System.out.println("����myDestroy������");
	}

	


}

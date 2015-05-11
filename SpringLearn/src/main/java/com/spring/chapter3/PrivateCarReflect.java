package com.spring.chapter3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {

	public static void main(String[] args)throws Throwable{
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.spring.chapter3.PrivateCar");
		PrivateCar car = (PrivateCar)clazz.newInstance();
		
		Field field = clazz.getDeclaredField("color");
		field.setAccessible(true);
		field.set(car, "ºìÉ«");
		
		Method method = clazz.getDeclaredMethod("drive", (Class[])null);
		method.setAccessible(true);
		method.invoke(car, null);
	}
}

package com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.Disk;
import com.spring.dao.imp.MoveDisk;

import junit.framework.TestCase;


public class SpringTest extends TestCase {

	public void read(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		
		Disk disc = (Disk)ctx.getBean("disk");
		disc.read();
		
	}

	public void read2() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Disk disk = (MoveDisk)Class.forName("com.spring.domain.MoveDisk").newInstance();
		disk.read();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		new SpringTest().read();
	}
}

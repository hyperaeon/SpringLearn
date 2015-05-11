package com.spring.service.test;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.Student;
import com.spring.service.StudentService;

import junit.framework.TestCase;

public class TestStudentService extends TestCase {

	public void testStutdent(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)ctx.getBean("student");
		student.setsId("s001");
		student.setsName("ÁÖ¾ø¶¥");
		student.setAge(101);
		StudentService sService = (StudentService)ctx.getBean("studentService");
		Assert.assertEquals(true, sService.saveStudentService(student));
		
	}
}

package com.forgyan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forgyan.teacher.Teacher;

public class BeanScopeApp {

	public static void main(String[] args) {
		// load the Spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		Teacher teacher =  context.getBean("scienceTeacher", Teacher.class);
		Teacher teacher1 =  context.getBean("scienceTeacher", Teacher.class);
		
		System.out.println(teacher==teacher1);
		
		// close application context
		context.close();
		
	}

}

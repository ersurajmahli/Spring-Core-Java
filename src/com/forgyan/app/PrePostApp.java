package com.forgyan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forgyan.teacher.Teacher;

public class PrePostApp {

	public static void main(String[] args) {
		// load the Spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		Teacher teacher =  context.getBean("inItAndDestroyTeacher", Teacher.class);
		
		// close application context
		context.close();
		
	}

}

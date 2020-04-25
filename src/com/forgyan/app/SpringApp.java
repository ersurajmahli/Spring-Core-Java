package com.forgyan.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forgyan.teacher.Teacher;

public class SpringApp {
	public static void main(String[] args) {
		// load the Spring configuration
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ForgyanConfig.class);
		
		// retrieve bean from container
		Teacher teacher = context.getBean("musicTeacher", Teacher.class);
		
		// call methods on bean
		System.out.println(teacher.teach());
		System.out.println(teacher.train());
		
		// close application context
		context.close();
	}
}

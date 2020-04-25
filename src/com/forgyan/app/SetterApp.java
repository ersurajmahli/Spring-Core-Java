package com.forgyan.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.forgyan.teacher.SocialScienceTeacher;

public class SetterApp {

	public static void main(String[] args) {
		// load the Spring configuration
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ForgyanConfig.class);
		
		// retrieve bean from container
		SocialScienceTeacher teacher = (SocialScienceTeacher) context.getBean("socialScienceTeacher");
		
		// call methods on bean
		System.out.println(teacher.teach());
		System.out.println(teacher.train());
		System.out.println(teacher.getName());
		System.out.println(teacher.getQualification());
		
		// close application context
		context.close();
	}

}

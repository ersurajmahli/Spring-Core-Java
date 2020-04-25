package com.forgyan.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.forgyan.coach.SwimCoach;
import com.forgyan.teacher.MusicTeacher;
import com.forgyan.teacher.Teacher;

@Configuration
@ComponentScan("com.forgyan")
@PropertySource("classpath:application.properties")
public class ForgyanConfig {
	
	
	
	@Bean
	public SwimCoach swimCoach() {
		SwimCoach swimCoach = new SwimCoach();
		return swimCoach;
	}
	
	@Bean
	public Teacher musicTeacher() {
		MusicTeacher musicTeacher = new MusicTeacher(swimCoach());
		return musicTeacher;
	}
	
}

package com.forgyan.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.forgyan.coach.CricketCoach;
@Component
public class MathTeacher implements Teacher{
	@Autowired
	private CricketCoach coach;
	
	public MathTeacher(CricketCoach coach) {
		this.coach=coach;
	}
	
	@Override
	public String teach() {
		return "Spend 1 hrs in solving questions";
	}

	@Override
	public String train() {
		return coach.train();
	}
}

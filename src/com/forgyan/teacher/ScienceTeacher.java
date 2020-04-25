package com.forgyan.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.forgyan.coach.Coach;
import com.forgyan.coach.CricketCoach;
@Component
public class ScienceTeacher implements Teacher {
	@Autowired
	private CricketCoach coach;
	
	 public ScienceTeacher(CricketCoach coach) {
		this.coach = coach;
	}

	@Override
	public String teach() {
		return "Chemistry, Biology & Physics is part of Science";
	}

	@Override
	public String train() {
		return coach.train();
	}

}

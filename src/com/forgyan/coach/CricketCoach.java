package com.forgyan.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String train() {
		return "Practice 2 Hrs Fast bowling and one hour Spin bowling";
	}

}

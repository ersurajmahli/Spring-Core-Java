package com.forgyan.teacher;

import com.forgyan.coach.SwimCoach;

public class MusicTeacher implements Teacher {
	
	private SwimCoach coach;
	
	public MusicTeacher(SwimCoach coach) {
		this.coach = coach;
	}

	@Override
	public String teach() {
		return "Indian folk songs are awesome";
	}

	@Override
	public String train() {
		return coach.train();
	}

}

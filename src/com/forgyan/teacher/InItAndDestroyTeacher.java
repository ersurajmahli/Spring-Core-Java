package com.forgyan.teacher;

import org.springframework.stereotype.Component;

@Component
public class InItAndDestroyTeacher implements Teacher {

	@Override
	public String teach() {
		return "Regular Teach Method";
	}

	@Override
	public String train() {
		return "No Dependency";
	}
	
	public void preDo() {
		System.out.println("INIT : calling");
	}
	
	public void postDo() {
		System.out.println("Destroy : calling");
	}

}

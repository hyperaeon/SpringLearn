package com.spring.chapter4;

public class Volunteer implements Thinker {

	private String thoughts;
	
	public String getThoughts() {
		return thoughts;
	}
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;

	}

}

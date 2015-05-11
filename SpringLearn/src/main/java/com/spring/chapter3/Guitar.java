package com.spring.chapter3;

import org.springframework.stereotype.Component;

import com.spring.chapter2.Instrument;

@Component
public class Guitar implements Instrument{

	public void play() {
		System.out.println("Guitar...");
	}
}

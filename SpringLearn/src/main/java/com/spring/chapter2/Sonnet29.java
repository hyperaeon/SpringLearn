package com.spring.chapter2;

public class Sonnet29 implements Poem {

	private static String[] LINES = { "When, in disgrace",
			" with fortune and men's eyes" };

	public Sonnet29() {

	}

	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}
}

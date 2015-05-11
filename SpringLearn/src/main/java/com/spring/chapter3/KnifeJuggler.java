package com.spring.chapter3;

import java.security.Provider;
import java.util.HashSet;
import java.util.Set;

import com.spring.chapter2.Juggler;

public class KnifeJuggler extends Juggler {

	private Set<Knife> knives;
	
//	public KnifeJuggler(Provider<Knife> knifeProvider) {
//		knives = new HashSet<Knife>();
//		for (int i = 0; i < 5; i++) {
//			knives.add(knifeProvider.get());
//		}
//	}
}

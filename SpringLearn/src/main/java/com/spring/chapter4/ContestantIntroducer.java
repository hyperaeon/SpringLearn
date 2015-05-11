package com.spring.chapter4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

	@DeclareParents(value = "com.spring.chapter3.Performer+", defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}

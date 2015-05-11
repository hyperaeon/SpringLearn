package com.spring.chapter5;

public interface SpitterDAO {

	void addSpitter(Spitter spitter);
	
	Spitter getSpitterById(long id);
}

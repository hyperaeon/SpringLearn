package com.spring.chapter10;

import java.util.List;

import com.spring.chapter5.Spitter;
import com.spring.chapter7.Spittle;

public interface SpitterService {

	List<Spittle> getRecentSpittles(int count);

	void saveSpittle(Spittle spittle);

	void saveSpitter(Spitter spitter);

	Spitter getSpitter(long id);

	void startFollowing(Spitter follower, Spitter followee);

	List<Spittle> getSpittlesForSpitter(Spitter spitter);

	List<Spittle> getSpittlesForSpitter(String username);

	Spitter getSpitter(String username);

	Spittle getSpittleById(long id);

	void deleteSpittle(long id);

	List<Spitter> getAllSpitters();
}

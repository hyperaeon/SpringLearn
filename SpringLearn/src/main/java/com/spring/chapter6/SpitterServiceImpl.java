package com.spring.chapter6;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.chapter5.Spitter;
import com.spring.chapter5.SpitterDAO;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SpitterServiceImpl implements SpitterDAO {

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addSpitter(Spitter spitter) {
		// TODO Auto-generated method stub

	}

	public Spitter getSpitterById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

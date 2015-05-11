package com.spring.chapter5;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("spitterDao")
@Transactional
public class JpaSpitterDao implements SpitterDAO {

	private static final String RECENT_SPITTLES = "select s from Spittle s";
	
	private static final String ALL_SPITTLES = "select s from Spittle s";
	
	private static final String SPITTLE_FOR_USERNAME = "select s from Spittle s WHERE s.username=:username";
	
	private static final String SPITTLE_BY_USERNAME = "select s from Spittle s WHERE s.username=:username";
	
	@PersistenceContext
	private EntityManager em;
	
	public void addSpitter(Spitter spitter) {
		em.persist(spitter);
	}

	public Spitter getSpitterById(long id) {
		return em.find(Spitter.class, id);
	}

	public void saveSpitter(Spitter spitter) {
		em.merge(spitter);
	}
}

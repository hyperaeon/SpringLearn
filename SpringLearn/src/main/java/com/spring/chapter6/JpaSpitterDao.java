package com.spring.chapter6;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.chapter5.Spitter;
import com.spring.chapter5.SpitterDAO;

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

	public void saveSpitter(final Spitter spitter) {
		final SpitterDAO spitterDao = new com.spring.chapter5.JpaSpitterDao(); 
		TransactionTemplate tx = new TransactionTemplate();
		tx.execute(new TransactionCallback<Void>(){
			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					spitterDao.addSpitter(spitter);
				} catch (RuntimeException e) {
					txStatus.setRollbackOnly();
					throw e;
				}
				return null;
			}
		});
	}
}

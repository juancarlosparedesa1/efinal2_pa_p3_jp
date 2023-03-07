package com.example.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

}

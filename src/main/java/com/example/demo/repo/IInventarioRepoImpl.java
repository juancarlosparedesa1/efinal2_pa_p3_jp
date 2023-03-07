package com.example.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Inventario;

@Transactional
@Repository
public class IInventarioRepoImpl implements IInventarioRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(inventario);
	}

}

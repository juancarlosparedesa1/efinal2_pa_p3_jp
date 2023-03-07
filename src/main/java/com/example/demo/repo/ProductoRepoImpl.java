package com.example.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo {

	@PersistenceContext 
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

}

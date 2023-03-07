package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;

@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepo bodegaRepo;
	@Override
	public void insertar(String nombre, Integer numeroBodega, String direccion, String telefono) {
		// TODO Auto-generated method stub
		
	}

}

package com.ejerciciorestaurante.app.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejerciciorestaurante.app.model.dao.ICocineroDao;
import com.ejerciciorestaurante.app.model.entity.Cocinero;

@Service
public class CocineroServiceImpl implements ICocineroService{
    
	@Autowired
	ICocineroDao cocineroDao;
	
	@Override
	@Transactional
	public List<Cocinero> obtenerCocineros() {
		List<Cocinero> cocineros = new ArrayList<>();
		cocineroDao.findAll().forEach(cocineros::add);
		return cocineros;
	}

}

package com.ejerciciorestaurante.app.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciorestaurante.app.model.dao.IMesaDao;
import com.ejerciciorestaurante.app.model.entity.Mesa;

@Service
public class MesaServiceImpl implements IMesaService{
    
	@Autowired
	private IMesaDao mesaDao;
	
	@Override
	public List<Mesa> obtenerMesas() {
		List<Mesa> mesas = new ArrayList<>();
		mesaDao.findAll().forEach(mesas::add);
		return mesas;
	}
   
}

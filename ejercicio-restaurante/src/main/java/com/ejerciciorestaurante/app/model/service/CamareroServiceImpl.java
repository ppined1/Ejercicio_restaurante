package com.ejerciciorestaurante.app.model.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejerciciorestaurante.app.model.dao.ICamareroDao;
import com.ejerciciorestaurante.app.model.dto.ConsultaCamarerosDTO;
import com.ejerciciorestaurante.app.model.entity.Camarero;

@Service
public class CamareroServiceImpl implements ICamareroService{
    
	@Autowired
    ICamareroDao camareroDao;
	
	@Override
	public List<Camarero> obtenerCamareros() {
		List<Camarero> camareros = new ArrayList<>();
		camareroDao.findAll().forEach(camareros::add);
		return camareros;
	}

	@Override
	@Transactional
	public List<ConsultaCamarerosDTO> obtenerConsultaCamareros() {
		List<Object[]> consultaCamareros = camareroDao.consultaCamareros();
		List<ConsultaCamarerosDTO> consultaCamarerosDTO = new ArrayList<>();
		for(Object[] consultaObj :  consultaCamareros){
			consultaCamarerosDTO.add(new ConsultaCamarerosDTO((String) consultaObj[0],(String) consultaObj[1],(String)consultaObj[2],(Integer) consultaObj[3],(BigDecimal) consultaObj[4]));
		}
		return consultaCamarerosDTO;
	}

}

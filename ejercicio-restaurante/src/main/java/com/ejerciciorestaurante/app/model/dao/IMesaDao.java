package com.ejerciciorestaurante.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejerciciorestaurante.app.model.entity.Mesa;

public interface IMesaDao extends CrudRepository<Mesa,Long>{

}

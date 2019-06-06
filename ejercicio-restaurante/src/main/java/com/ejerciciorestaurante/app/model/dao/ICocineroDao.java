package com.ejerciciorestaurante.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejerciciorestaurante.app.model.entity.Cocinero;

public interface ICocineroDao extends CrudRepository<Cocinero,Long>{

}

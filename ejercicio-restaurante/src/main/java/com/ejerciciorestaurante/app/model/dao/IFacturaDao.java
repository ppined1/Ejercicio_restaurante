 package com.ejerciciorestaurante.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejerciciorestaurante.app.model.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura,Long>{
   
}

package com.ejerciciorestaurante.app.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ejerciciorestaurante.app.model.dto.ConsultaClientesDTO;
import com.ejerciciorestaurante.app.model.entity.Cliente;
import com.ejerciciorestaurante.app.model.utility.Constante;

public interface IClienteDao extends CrudRepository<Cliente,Long>{
  
	
	@Query(value=Constante.CONSULTAS_COMPRAS_CLIENTES,nativeQuery=true)
	public List<Object[]> consultaClientesPrecio();
}

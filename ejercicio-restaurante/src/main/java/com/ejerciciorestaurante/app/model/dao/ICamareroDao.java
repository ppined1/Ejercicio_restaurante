package com.ejerciciorestaurante.app.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ejerciciorestaurante.app.model.dto.ConsultaCamarerosDTO;
import com.ejerciciorestaurante.app.model.entity.Camarero;
import com.ejerciciorestaurante.app.model.utility.Constante;

public interface ICamareroDao extends CrudRepository<Camarero,Long>{
  
	@Query(value=Constante.CONSULTA_VENTAS_MES_CAMAREROS , nativeQuery = true)
	public List<Object[]> consultaCamareros();
	
}

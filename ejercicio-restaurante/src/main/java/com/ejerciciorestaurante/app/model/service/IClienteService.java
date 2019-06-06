package com.ejerciciorestaurante.app.model.service;

import java.util.List;

import com.ejerciciorestaurante.app.model.dto.ConsultaClientesDTO;
import com.ejerciciorestaurante.app.model.entity.Cliente;

public interface IClienteService {
   
	public List<Cliente> obtenerClientes();
	
	public List<ConsultaClientesDTO> consultaClientesPrecio();
}

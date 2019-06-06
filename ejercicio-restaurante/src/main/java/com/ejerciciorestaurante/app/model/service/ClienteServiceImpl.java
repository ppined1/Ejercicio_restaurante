package com.ejerciciorestaurante.app.model.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejerciciorestaurante.app.model.dao.IClienteDao;
import com.ejerciciorestaurante.app.model.dto.ConsultaClientesDTO;
import com.ejerciciorestaurante.app.model.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
    
	@Autowired
	IClienteDao clienteDao;
	
	@Override
	@Transactional
	public List<Cliente> obtenerClientes() {
		List<Cliente> clientes = new ArrayList<>();
		clienteDao.findAll().forEach(clientes::add);
		return clientes;
	}

	@Override
	@Transactional
	public List<ConsultaClientesDTO> consultaClientesPrecio() {
		List<ConsultaClientesDTO> consultaClientes = new ArrayList<>();
		for(Object[] objCliente : clienteDao.consultaClientesPrecio()){
			consultaClientes.add(new ConsultaClientesDTO((String) objCliente[0],(String) objCliente[1],(String) objCliente[2],(BigDecimal) objCliente[3]));
		}
		return consultaClientes;
	}

}

package com.ejerciciorestaurante.app.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ejerciciorestaurante.app.EjercicioRestauranteApplication;
import com.ejerciciorestaurante.app.model.dto.ConsultaCamarerosDTO;
import com.ejerciciorestaurante.app.model.dto.ConsultaClientesDTO;
import com.ejerciciorestaurante.app.model.entity.Camarero;
import com.ejerciciorestaurante.app.model.entity.Cliente;
import com.ejerciciorestaurante.app.model.entity.Cocinero;
import com.ejerciciorestaurante.app.model.entity.DetalleFactura;
import com.ejerciciorestaurante.app.model.entity.Factura;
import com.ejerciciorestaurante.app.model.entity.Mesa;
import com.ejerciciorestaurante.app.model.service.ICamareroService;
import com.ejerciciorestaurante.app.model.service.IClienteService;
import com.ejerciciorestaurante.app.model.service.ICocineroService;
import com.ejerciciorestaurante.app.model.service.IFacturaService;
import com.ejerciciorestaurante.app.model.service.IMesaService;

@RestController
@RequestMapping("/restapi")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ClienteController {

	@Autowired
	private IFacturaService facturaService;

	@Autowired
	private IMesaService mesaService;

	@Autowired
	private ICamareroService camareroService;

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private ICocineroService cocineroService;

	@PostMapping(value = "/guardarFactura")
	@ResponseBody
	public Factura guardarFactura(@RequestBody Factura factura) {
		return facturaService.crearFactura(factura);
	}

	@GetMapping(value = "/obtenerMesas")
	@ResponseBody
	public ResponseEntity<List<Mesa>> obtenerMesas() {
		return new ResponseEntity<List<Mesa>>(mesaService.obtenerMesas(), HttpStatus.OK);
	}

	@GetMapping(value = "/obtenerCamareros")
	public List<Camarero> obtenerCamareros() {
		return camareroService.obtenerCamareros();
	}

	@GetMapping(value = "/obtenerClientes")
	@ResponseBody
	public List<Cliente> obtenerClientes() {
		return clienteService.obtenerClientes();
	}

	@GetMapping(value = "/obtenerCocineros")
	@ResponseBody
	public List<Cocinero> obtenerCocineros() {
		return cocineroService.obtenerCocineros();
	}
	
	@GetMapping(value = "/obtenerConsultaCamareros")
	@ResponseBody
	public List<ConsultaCamarerosDTO> obtenerConsultaCamareros() {
		return camareroService.obtenerConsultaCamareros();
	}
	
	@GetMapping(value = "/obtenerConsultaClientes")
	@ResponseBody
	public List<ConsultaClientesDTO> obtenerConsultaClientes() {
		return clienteService.consultaClientesPrecio();
	}
	

}

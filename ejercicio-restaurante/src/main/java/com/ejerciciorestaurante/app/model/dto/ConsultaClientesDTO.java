package com.ejerciciorestaurante.app.model.dto;

import java.math.BigDecimal;

public class ConsultaClientesDTO {
	private String apellido1;
	private String nombre;
	private String apellido2;
	private Long suma;

	public ConsultaClientesDTO() {

	}

	public ConsultaClientesDTO(String nombre, String apellido1, String apellido2, BigDecimal suma) {
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setSuma(suma.longValue());
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Long getSuma() {
		return suma;
	}

	public void setSuma(Long suma) {
		this.suma = suma;
	}

}

package com.ejerciciorestaurante.app.model.dto;

import java.math.BigDecimal;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class ConsultaCamarerosDTO {
	private String nombre;

	private String apellido1;

	private String apellido2;

	private String mes;

	private Long suma;

	public ConsultaCamarerosDTO() {

	}

	public ConsultaCamarerosDTO(String nombre, String apellido1, String apellido2, Integer mes, BigDecimal suma) {
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		if (mes != null)
			setMes(new DateFormatSymbols().getMonths()[mes - 1]);
		else
			setMes(new DateFormatSymbols().getMonths()[Calendar.getInstance().get(Calendar.MONTH)]);
		if (suma != null)
			setSuma(suma.longValue());
		else
			setSuma(0L);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Long getSuma() {
		return suma;
	}

	public void setSuma(Long suma) {
		this.suma = suma;
	}

}

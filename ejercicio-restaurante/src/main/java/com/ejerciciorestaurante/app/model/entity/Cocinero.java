package com.ejerciciorestaurante.app.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cocinero")
public class Cocinero implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 2826044349361390878L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cocinero")
	public Long id;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	@OneToMany(mappedBy = "cocinero",cascade=CascadeType.PERSIST)
	private List<DetalleFactura> detalleFacturaList;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Cocinero(){
		
	}
}

package com.ejerciciorestaurante.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mesa")
public class Mesa implements Serializable{

	private static final long serialVersionUID = 532192883734600293L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mesa")
	private Long id;
	
	@Column(name="num_max_comensa")
	private Integer numMaxComensa;
	
	private String ubicacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumMaxComensa() {
		return numMaxComensa;
	}

	public void setNumMaxComensa(Integer numMaxComensa) {
		this.numMaxComensa = numMaxComensa;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public Mesa(){
		
	}
	
}

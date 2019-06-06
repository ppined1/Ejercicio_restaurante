package com.ejerciciorestaurante.app.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="factura")
public class Factura implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 3593715001711977572L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_factura")
	private Long id;
	
	@ManyToOne
    @JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	
	@ManyToOne
    @JoinColumn(name="id_camarero")
	private Camarero camarero;
	
	@ManyToOne
    @JoinColumn(name="id_mesa")
	private Mesa mesa;
	
	@NotNull
    @Column(name="fecha_factura")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaFactura;
    
	
	@OneToMany(targetEntity=DetalleFactura.class, mappedBy = "factura",fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private List<DetalleFactura> detalleFacturaList = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	
	public Factura(){
		
	}

	public List<DetalleFactura> getDetalleFacturaList() {
		return detalleFacturaList;
	}

	public void setDetalleFacturaList(List<DetalleFactura> detalleFacturaList) {
		this.detalleFacturaList = detalleFacturaList;
	}
	
	
	
}

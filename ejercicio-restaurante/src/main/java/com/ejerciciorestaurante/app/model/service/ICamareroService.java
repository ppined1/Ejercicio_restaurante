package com.ejerciciorestaurante.app.model.service;

import java.util.List;

import com.ejerciciorestaurante.app.model.dto.ConsultaCamarerosDTO;
import com.ejerciciorestaurante.app.model.entity.Camarero;

public interface ICamareroService {
	
    public List<Camarero> obtenerCamareros();
    
    public List<ConsultaCamarerosDTO> obtenerConsultaCamareros();
}

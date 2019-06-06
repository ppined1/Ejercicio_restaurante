package com.ejerciciorestaurante.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejerciciorestaurante.app.model.dao.IFacturaDao;
import com.ejerciciorestaurante.app.model.entity.DetalleFactura;
import com.ejerciciorestaurante.app.model.entity.Factura;
import com.ejerciciorestaurante.app.model.entity.Mesa;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaDao iFacturaDao;

	@Override
	@Transactional
	public Factura crearFactura(Factura factura) {
		for (DetalleFactura detallefactura : factura.getDetalleFacturaList()) {
			if (detallefactura.getFactura() == null)
				detallefactura.setFactura(factura);
		}
		return iFacturaDao.save(factura);
	}

}

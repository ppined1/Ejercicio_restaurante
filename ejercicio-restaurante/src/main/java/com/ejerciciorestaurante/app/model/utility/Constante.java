package com.ejerciciorestaurante.app.model.utility;

public class Constante {
	public static final String CONSULTA_VENTAS_MES_CAMAREROS = " SELECT c.nombre, c.apellido1, c.apellido2, "
			+ "MONTH(f.fecha_factura) AS mes, " + "SUM(df.importe) AS suma " + "FROM CAMARERO c "
			+ "LEFT JOIN FACTURA f " + "ON f.id_camarero = c.id_camarero  " + "LEFT JOIN DETALLE_FACTURA df "
			+ "ON df.id_factura = f.id_factura " + "GROUP BY mes";
	
	public static final String CONSULTAS_COMPRAS_CLIENTES = 
"SELECT * FROM ("
+"SELECT c.nombre, c.apellido1, c.apellido2,SUM(df.importe)  AS suma "
+"FROM CLIENTE c "
+"LEFT JOIN FACTURA f "
+"ON f.id_cliente = c.id_cliente " 
+"LEFT JOIN DETALLE_FACTURA df "
+"ON df.id_factura = f.id_factura "
+"GROUP BY c.id_cliente "
+") query "
+"WHERE query.suma > 100000 ";

}

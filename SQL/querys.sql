SET lc_time_names = 'es_MX';

SELECT c.nombre, c.apellido1, c.apellido2, MONTHname(f.fecha_factura) AS mes,SUM(df.importe)  AS suma
FROM CAMARERO c
LEFT JOIN FACTURA f
ON f.id_camarero = c.id_camarero 
LEFT JOIN DETALLE_FACTURA df
ON df.id_factura = f.id_factura
GROUP BY mes

--Primera consulta

SELECT * FROM (
SELECT c.nombre, c.apellido1, c.apellido2,SUM(df.importe)  AS suma
FROM CLIENTE c
LEFT JOIN FACTURA f
ON f.id_cliente = c.id_cliente 
LEFT JOIN DETALLE_FACTURA df
ON df.id_factura = f.id_factura
GROUP BY c.id_cliente
) query
WHERE query.suma > 100000
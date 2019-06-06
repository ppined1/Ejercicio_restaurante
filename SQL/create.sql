CREATE DATABASE IF NOT EXISTS ejercicio_cocina;

USE ejercicio_cocina;

CREATE TABLE cliente(
  id_cliente int(255) auto_increment not null,
  nombre varchar(255) not null,
  apellido1 varchar(255),
  apellido2 varchar(255),
  observaciones text,
  CONSTRAINT pk_cliente PRIMARY KEY(id_cliente) 
)ENGINE=InnoDb;

CREATE TABLE mesa(
  id_mesa int(255) auto_increment not null,
  num_max_comensa int(255) not null,
  ubicacion varchar(255) not null,
  CONSTRAINT pk_mesa PRIMARY KEY(id_mesa) 
)ENGINE=InnoDb;

CREATE TABLE cocinero(
  id_cocinero int(255) auto_increment not null,
  nombre varchar(255) not null,
  apellido1 varchar(255),
  apellido2 varchar(255),
  CONSTRAINT pk_cocinero PRIMARY KEY(id_cocinero) 
)ENGINE=InnoDb;

CREATE TABLE camarero(
  id_camarero int(255) auto_increment not null,
  nombre varchar(255) not null,
  apellido1 varchar(255),
  apellido2 varchar(255),
  CONSTRAINT pk_camarero PRIMARY KEY(id_camarero) 
)ENGINE=InnoDb;

CREATE TABLE factura(
  id_factura int(255) auto_increment not null,
  id_cliente int(255) not null,
  id_camarero int(255) not null,
  id_mesa int(255) not null,
  fecha_factura date not null,
  CONSTRAINT pk_factura PRIMARY KEY(id_factura),
  CONSTRAINT fk_cliente_factura FOREIGN KEY(id_cliente) REFERENCES cliente(id_cliente),
  CONSTRAINT fk_cliente_camarero FOREIGN KEY(id_camarero) REFERENCES camarero(id_camarero),
  CONSTRAINT fk_cliente_mesa FOREIGN KEY(id_mesa) REFERENCES mesa(id_mesa)
)ENGINE=InnoDb;

CREATE TABLE detalle_factura(
  id_detalle_factura int(255) auto_increment not null,
  id_factura int(255) not null,
  id_cocinero int(255) not null,
  plato varchar(255),
  importe int(255),
  CONSTRAINT pk_detalle_factura PRIMARY KEY(id_detalle_factura),
  CONSTRAINT fk_detallefactura_factura FOREIGN KEY(id_factura) REFERENCES factura(id_factura),
  CONSTRAINT fk_detallefactura_cocinero FOREIGN KEY(id_cocinero) REFERENCES cocinero(id_cocinero)
)ENGINE=InnoDb 













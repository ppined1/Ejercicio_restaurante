import {DetalleFactura} from './detalle-factura';
import {Cliente} from './cliente';
import {Camarero} from './camarero';
import {Mesa} from './mesa';

export class Factura{
     
    constructor(
     public id:number,
	 public cliente:Cliente,
	 public camarero:Camarero,
	 public mesa:Mesa,
     public fechaFactura:Date,
	 public detalleFacturaList:Array<DetalleFactura> 
    ){}   

} 
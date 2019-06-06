import {Factura} from './factura';
import {Cocinero} from './cocinero';

export class DetalleFactura{

	constructor(
         public id:number,
	     public factura:Factura,
	     public cocinero:Cocinero,
         public plato: string,
         public importe:number
		){

	}
}
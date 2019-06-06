import {Component} from '@angular/core';
import {Router,ActivatedRoute,Params} from '@angular/router';
import {FacturaService} from '../services/factura.services';

import  {Factura} from '../models/factura';
import {Mesa} from '../models/mesa';
import {Cliente} from '../models/cliente';
import {Camarero} from '../models/camarero';
import {DetalleFactura} from '../models/detalle-factura';
import {Cocinero} from '../models/cocinero'
import  {GLOBAL} from '../services/constante';



@Component({
	    selector : 'registrar-factura',
	    templateUrl : '../views/registrar-factura.html',
	    providers : [FacturaService]
	})
export class RegistrarFacturaComponent{
   public titulo : string; 
   public factura : Factura;  
   public mesas:Mesa[];
   public clientes:Cliente[];
   public camareros:Camarero[];
   public cocineros:Cocinero[];
   
   constructor(     
        private _facturaService: FacturaService,      
   	    private _route: ActivatedRoute,
        private _router: Router ){
   	        this.factura = new Factura(0,undefined,undefined,undefined,new Date(),[]);
   	        this.mesas = [];
            this.clientes = [];
            this.camareros = []; 
            this.cocineros = [];
        	  this.titulo = "Crear Factura";
            this.factura.detalleFacturaList = [];
            let detalleFactura : DetalleFactura = new DetalleFactura(null,undefined,undefined,'',0);
            this.factura.detalleFacturaList.push(detalleFactura);
   }

   ngOnInit(){
       this.obtenerMesas();
       this.obtenerClientes();
       this.obtenerCamareros();
       this.obtenerCocineros(); 
   }
   
   obtenerMesas(){
       this._facturaService.obtenerMesas().subscribe(
             result => {
                  this.mesas=result;
             },
             error => {
                 console.log(<any>error);      
             }
            );
   }

   obtenerClientes(){
        this._facturaService.obtenerClientes().subscribe(
             result => {
                  this.clientes=result;
             },
             error => {
                 console.log(<any>error);      
             }
            );
   }

   obtenerCamareros(){
          this._facturaService.obtenerCamareros().subscribe(
               result => {
                    this.camareros=result;
               },
               error => {
                   console.log(<any>error);      
               }
            );
   }

  obtenerCocineros(){
          this._facturaService.obtenerCocineros().subscribe(
               result => {
                    this.cocineros=result;
                    console.log(this.cocineros);
               },
               error => {
                   console.log(<any>error);      
               }
            );
   }

   onSubmit(){
      this.saveFactura();
   }

   saveFactura(){
      this.factura.fechaFactura = new Date();
      console.log(this.factura);
       this._facturaService.guardarFactura(this.factura).subscribe(
             result => {
                  console.log('se guardo con exito');
                  this.factura = new Factura(0,undefined,undefined,undefined,new Date(),[]);
                  let detalleFactura : DetalleFactura = new DetalleFactura(null,undefined,undefined,'',0);
                  this.factura.detalleFacturaList.push(detalleFactura);
                  alert('se guardo con exito');
             },
             error => {
                 console.log(<any>error);    
             }
            );
   }

   agregarPlato(){
        let detalleFactura  = new DetalleFactura(null,undefined,undefined,'',0);
        this.factura.detalleFacturaList.push(detalleFactura);
   }




}
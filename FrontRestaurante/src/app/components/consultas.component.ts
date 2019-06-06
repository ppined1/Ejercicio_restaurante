import {Component} from '@angular/core';
import {Router,ActivatedRoute,Params} from '@angular/router';
import {FacturaService} from '../services/factura.services';

import {ConsultaCamarerosDTO} from '../models/consulta-camareros';
import {ConsultaClientesDTO} from '../models/consulta-clientes';

@Component({
	    selector : 'consultas',
	    templateUrl : '../views/consultas.html',
	    providers : [FacturaService]
	})
export class ConsultasComponent{
     public titulo : string;
     public consultaClienteList:ConsultaClientesDTO[];
     public consultaCamarerosList:ConsultaCamarerosDTO[];

     constructor(
     	private _facturaService: FacturaService,      
   	    private _route: ActivatedRoute,
        private _router: Router ){
     		this.titulo = "Consultas";
     		this.consultaCamarerosList = [];
     		this.consultaClienteList = [];
     }

     ngOnInit(){
         this.obtenerCamareros();
         this.obtenerClientes(); 
     }

     obtenerCamareros(){
         this._facturaService.obtenerConsultaCamarerosVenta().subscribe(
             result => {
                  this.consultaCamarerosList=result;
             },
             error => {
                 console.log(<any>error);      
             }
            ); 
     }

     obtenerClientes(){
         this._facturaService.obtenerConsultaClientesPrecio().subscribe(
             result => {
                  this.consultaClienteList=result;
             },
             error => {
                 console.log(<any>error);      
             }
            );   
     }


}
import {Injectable} from '@angular/core';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
import {map} from 'rxjs/operators';
import  {Observable} from 'rxjs';

import {GLOBAL} from './constante';
import  {Factura} from '../models/factura'

 
@Injectable()
export class FacturaService{
    public url:string;

    constructor(private _http:Http){
        this.url = GLOBAL.url;   
    }

    obtenerMesas(){
    	return this._http.get(this.url+'obtenerMesas').pipe(map(res=>res.json()));
    }

    obtenerClientes(){
    	return this._http.get(this.url+'obtenerClientes').pipe(map(res=>res.json()));
    }

    obtenerCamareros(){
    	return this._http.get(this.url+'obtenerCamareros').pipe(map(res=>res.json()));
    }

    obtenerCocineros(){
    	return this._http.get(this.url+'obtenerCocineros').pipe(map(res=>res.json()));
    }

    obtenerConsultaClientesPrecio(){
        
        return this._http.get(this.url+'obtenerConsultaClientes').pipe(map(res=>res.json()));
    }

    obtenerConsultaCamarerosVenta(){
        return this._http.get(this.url+'obtenerConsultaCamareros').pipe(map(res=>res.json()));
    }

    guardarFactura(factura: Factura){
          let json = JSON.stringify(factura);
          let params = 'json='+json;
          let headers = new Headers({'Content-Type':'application/json'}) ;
          console.log(params);
          return this._http.post(this.url+'guardarFactura', factura, {headers : headers}).pipe(map(res => res.json()));
    }



}
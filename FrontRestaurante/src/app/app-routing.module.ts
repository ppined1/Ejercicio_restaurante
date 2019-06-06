import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core' ;

import {HomeComponent} from './components/home.component';
import { RegistrarFacturaComponent } from './components/registrarfactura.component';
import {ConsultasComponent} from './components/consultas.component'

const routes: Routes = [
   {path: '', component : HomeComponent },
   {path: 'home', component : HomeComponent },
   {path: 'registrar-factura', component : RegistrarFacturaComponent },
   {path: 'consultas', component : ConsultasComponent }
   ];

export const appRoutingProviders: any[] = [];
export const routing : ModuleWithProviders = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {DataTableModule} from "angular-6-datatable";


import { AppRoutingModule,routing } from './app-routing.module';
import { AppComponent } from './app.component';

import {HttpModule} from '@angular/http';
import { FormsModule }   from '@angular/forms';

import { RegistrarFacturaComponent } from './components/registrarfactura.component';
import {HomeComponent} from './components/home.component';
import {ConsultasComponent} from './components/consultas.component'

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegistrarFacturaComponent,
    ConsultasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    DataTableModule,
    routing,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

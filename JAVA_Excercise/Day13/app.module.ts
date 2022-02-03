import { NgModule } from '@angular/core';
import { FormsModule , ReactiveFormsModule} from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'

import { AppComponent } from './app.component';
import { TemplateDrivenFormExComponent } from './template-driven-form-ex/template-driven-form-ex.component';
import { ModelDrivenFormEx1Component } from './model-driven-form-ex1/model-driven-form-ex1.component';
import { FetchPersonComponent } from './fetch-person/fetch-person.component';
import { FetchPersonsComponent } from './fetch-persons/fetch-persons.component';


@NgModule({
  declarations: [
    AppComponent,
    TemplateDrivenFormExComponent,
    ModelDrivenFormEx1Component,
    FetchPersonComponent,
    FetchPersonsComponent,
    //Person.ServiceComponent
  ],
  imports: [
    BrowserModule,FormsModule, ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

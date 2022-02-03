import { Component, OnInit } from '@angular/core';
import { FormBuilder , Validators } from '@angular/forms';
@Component({
  selector: 'app-model-driven-form-ex1',
  templateUrl: './model-driven-form-ex1.component.html',
  styleUrls: ['./model-driven-form-ex1.component.css']
})
export class ModelDrivenFormEx1Component  {

  constructor(public builder:FormBuilder) {}
  profile=this.builder.group({
    firstname:["" ,Validators.compose([Validators.required, Validators.minLength(3)])],
    lastname:["", Validators.compose([Validators.required,Validators.minLength(5)])]

  });
  handleSubmit() : void{
    console.log(this.profile.value)
  }

 
}

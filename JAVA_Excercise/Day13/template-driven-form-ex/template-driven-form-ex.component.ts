import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-template-driven-form-ex',
  templateUrl: './template-driven-form-ex.component.html',
  styleUrls: ['./template-driven-form-ex.component.css']
})
export class TemplateDrivenFormExComponent  {

  handleSubmit(formData:any):void{
    console.log(formData)
  }

}

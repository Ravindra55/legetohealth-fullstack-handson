import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-examples',
  templateUrl: './examples.component.html',
  styleUrls: ['./examples.component.css']
})
export class ExamplesComponent {
  name : string="Jaga";
  salary: number=40000;
  dob : Date =new Date(1995, 9, 10);
  fruits: any =["apple","banana","grapes"]
  status : boolean=true;

  employee:any=[
    {id:10,name:"anil",salary:40000},
    {id:20,name:"yunus",salary:50000},
    {id:30,name:"jaga",salary:30000}
  ]





  }



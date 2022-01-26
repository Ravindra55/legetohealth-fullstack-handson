import { Component } from "@angular/core";

@Component({
    selector:'demo-app',
    templateUrl:'./demo.component.html'
})
export class DemoComponent {
    firstname:string="ravi";
    lastname:string="v";
    dob:Date=new Date(2000, 10, 22);
}
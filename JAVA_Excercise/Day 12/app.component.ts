import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
  users=[
    {name:"anil",gender:"Male"},
    {name:"yunus",gender:"Male"},
    {name:"sam",gender:"Female"}

  ]
}

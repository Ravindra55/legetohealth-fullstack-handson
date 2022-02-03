import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  username=undefined;

  constructor(private _activatedRouter:ActivatedRoute) { }

  ngOnInit(): void {
    this._activatedRouter.parent?.params.subscribe((p)=>this.username=p['un']);
  }

}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DemoComponent } from './demo/demo.component';
import { ExamplesComponent } from './examples/examples.component';
import { DataBindComponent } from './data-bind/data-bind.component';
import { FormsModule } from '@angular/forms';
import { GenderPipe } from './gender.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    DemoComponent,
    ExamplesComponent,
    DataBindComponent,
    GenderPipe,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

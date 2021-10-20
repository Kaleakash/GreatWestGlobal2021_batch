import { Component } from '@angular/core';

@Component({                  // decorator 
  selector: 'app-root',                 // <app-root></app-root> This is user-defined tag 
  templateUrl: './app.component.html',  // to connect html page 
  styleUrls: ['./app.component.css']    // to connect css page 
})
export class AppComponent {
 //title = 'demo-app';
 id:number = 100;     // int a=10;
 name:string ="Raj";
 age : number = 21;
 result : boolean = true;
 
}

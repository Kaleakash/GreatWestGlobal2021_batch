import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg:string="";
  constructor() { }

  ngOnInit(): void {
  }

  checkUser(loginRef:any){
    let login = loginRef.value;
    //console.log(login);
    if(login.user =="Raj" && login.pass=="123"){
        this.msg = "Successfully Login"
    }else {
        this.msg =  "Failure try once again"
    }
  }
}

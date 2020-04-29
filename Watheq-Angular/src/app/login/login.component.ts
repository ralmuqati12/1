import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email = ''
  password = ''

  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  handleLogin(){
    console.log(this.email)
    //this.router.navigate[('home')] //from login page to home page 
  }

}

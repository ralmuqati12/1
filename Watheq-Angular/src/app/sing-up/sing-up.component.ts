import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sing-up',
  templateUrl: './sing-up.component.html',
  styleUrls: ['./sing-up.component.css']
})
export class SingUpComponent implements OnInit {
  title: string;
 
  constructor() {
    this.title = 'Spring Boot - Angular Application';
  }
  

  ngOnInit(): void {
  }

}

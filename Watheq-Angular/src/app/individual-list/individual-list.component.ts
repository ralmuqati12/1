import { Component, OnInit } from '@angular/core';
import { Individual } from '../individual';
import { IndividualserviceService } from '../individualservice.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-individual-list',
  templateUrl: './individual-list.component.html',
  styleUrls: ['./individual-list.component.css']
})
export class IndividualListComponent implements OnInit {
  individual: Observable<Individual[]>;
  
  
  constructor(private individualserviceService: IndividualserviceService){}
  ngOnInit(): void {
    this.individualserviceService.findAll().subscribe(data => {
      this.individual = data;
    });
  }
}

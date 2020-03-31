import { Component, OnInit } from '@angular/core';
import { Individual } from '../individual';
import { IndividualserviceService } from '../individualservice.service';

@Component({
  selector: 'app-individual-form',
  templateUrl: './individual-form.component.html',
  styleUrls: ['./individual-form.component.css']
})
export class IndividualFormComponent implements OnInit {
  individual: Individual = new Individual;
  submitted = false;

 constructor(private individualserviceService: IndividualserviceService ) { }

  ngOnInit(): void {

  }
  newCompany(): void {
    this.submitted = false;
    this.individual = new Individual();
  }
  onSubmit() {
    this.save();
  }

  save() {
    this.individualserviceService.save(this.individual)
      .subscribe(
        data => {
          console.log(data);
          this.submitted = true;
        },
        error => console.log(error));
    this.individual = new Individual();
  }

}

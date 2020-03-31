import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { CompanyserviceService } from '../companyservice.service';



@Component({
  selector: 'app-company-form',
  templateUrl: './company-form.component.html',
  styleUrls: ['./company-form.component.css']
})
export class CompanyFormComponent implements OnInit {
  company: Company = new Company;
  submitted = false;

 constructor(private companyserviceService: CompanyserviceService ) { }

  ngOnInit(): void {

  }

  newCompany(): void {
    this.submitted = false;
    this.company = new Company();
  }
  onSubmit() {
    this.save();
  }

  save() {
    this.companyserviceService.save(this.company)
      .subscribe(
        data => {
          console.log(data);
          this.submitted = true;
        },
        error => console.log(error));
    this.company = new Company();
  }

 

}

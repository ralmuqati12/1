import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { CompanyserviceService } from '../companyservice.service';
import { Observable } from 'rxjs/internal/Observable';


@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  cr: string;

 company: any;

submitted = false;
  

  constructor(private companyserviceService: CompanyserviceService) { }

  ngOnInit(): void {
  }
  searchCompany(){
    this.companyserviceService.searchCompany(this.cr)
    .subscribe(
      data => {
        this.company = data;
        console.log(data);
        this.submitted = true;
      },
      error => console.log(error));
      this.company = new Company();
      }
}

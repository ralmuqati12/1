import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Company } from '../company';
import { CompanyserviceService } from '../companyservice.service';




@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {
  
  company: Observable<Company[]>;
  deleteMessage=false; 
  message: string

  constructor (private companyserviceService: CompanyserviceService){}
  ngOnInit() {
    this.companyserviceService.findAll().subscribe(data => {
      this.company = data;
    }); 
  }
 
  // deleteCompany(cr: String) {
  //   this.companyserviceService.deleteCompany(cr)
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.reloadData();
  //       },
  //       error => console.log(error));
  // }
  reloadData() {
    this.company = this.companyserviceService.findAll();
  // }
  // deleteEmployee(cr: String) {
  //   this.companyserviceService.deleteEmployee(cr)
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.reloadData();
  //       },
  //       error => console.log(error));
  // // }
 
}
// deleteCompany(cr){
//   console.log('delete ${cr}')
//   this.companyserviceService.deleteCompany(cr).subscribe(
//     data => {
//       console.log(data);
//       this.message = "Delete Successfuli"
    
//     }
//   )
// }
}
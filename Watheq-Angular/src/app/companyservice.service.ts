import { Company } from './company';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CompanyserviceService {
   createCompany(company: Company) {
   throw new Error("Method not implemented.");
  }
  //companniesUrl
  private companyUrl: string;
  // private companyUrl2: string;
  private companyUr2: string;
  constructor(private http: HttpClient) {
    this.companyUrl = 'http://localhost:8080/api/';
    // this.companyUrl2 = 'http://localhost:8080/api/ompanies';
    // this.companyUr2 = 'http://localhost:8080/api/employees/';
  }
   findAll(): Observable<any> {
    return this.http.get(this.companyUrl+'company');
  }

  save(company: any) {
    return this.http.post<Company>(this.companyUrl+'companysave', company);
  }
  
  // deleteCompany(cr: String): Observable<any> {
  //   return this.http.delete(`${this.companyUrl2}/${cr}`, { responseType: 'text' });
  // }
  // deleteEmployee(cr: String): Observable<any> {
  //   return this.http.delete(`${this.companyUr2}/${cr}`, { responseType: 'text' });
  // }


  searchCompany(cr): Observable<any>{
    return this.http.get(this.companyUrl+'companyse/'+cr)
    
  }



  // deleteCompany(cr){

  //   return this.http.delete('http://localhost:8080/api//companies/${cr}')
  // }
 

}

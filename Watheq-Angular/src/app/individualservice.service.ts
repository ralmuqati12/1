import { Injectable } from '@angular/core';
import { Individual } from './individual';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class IndividualserviceService {
  createIndividual(individual: Individual) {
    throw new Error("Method not implemented.");
   }
   private IndividualUrl: string;
 
   constructor(private http: HttpClient) {
     this.IndividualUrl = 'http://localhost:8080/api/';
   }
    findAll(): Observable<any> {
     return this.http.get(this.IndividualUrl+'individual');
   }
 
   save(individual: any) {
     return this.http.post<Individual>(this.IndividualUrl+'individualsave', individual);
   }

}

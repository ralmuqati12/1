import { Injectable } from '@angular/core';
import { EduInstitution } from './edu-institution';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EduInstitutionserviceService {
  createEdu(eduInstitution: EduInstitution) {
    throw new Error("Method not implemented.");
   }
   private eduUrl: string;
 
   constructor(private http: HttpClient) {
     this.eduUrl = 'http://localhost:8080/api/';
   }
    findAll(): Observable<any> {
     return this.http.get(this.eduUrl+'EduInstitution');
   }
 
   save(eduInstitution: any) {
     return this.http.post<EduInstitution>(this.eduUrl+'edusave', eduInstitution);
   }
  
}

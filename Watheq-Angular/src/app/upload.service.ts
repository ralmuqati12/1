import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpRequest, HttpEvent } from '@angular/common/http';
import { Uploadfile } from './uploadfile';

@Injectable({
  providedIn: 'root'
})
export class UploadService {
  
  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {
   
   }

  //  findAll(): Observable<any> {
  //   return this.http.get(this.baseUrl+'company');
  // }

  save(uploadfile: any) {
    return this.http.post<Uploadfile>(this.baseUrl+'/uploadsave', uploadfile);
  }


  upload(file: File): Observable<HttpEvent<any>> {
    const formData: FormData = new FormData();

    formData.append('file', file);

    const req = new HttpRequest('POST', `${this.baseUrl}/upload`, formData, {
      reportProgress: true,
      responseType: 'json'
    });

    return this.http.request(req);
  }

  // getFiles(): Observable<any> {
  //   return this.http.get(`${this.baseUrl}/files`);
  // }





}
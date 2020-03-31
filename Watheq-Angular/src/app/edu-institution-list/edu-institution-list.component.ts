import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EduInstitution } from '../edu-institution';
import { EduInstitutionserviceService } from '../edu-institutionservice.service';


@Component({
  selector: 'app-edu-institution-list',
  templateUrl: './edu-institution-list.component.html',
  styleUrls: ['./edu-institution-list.component.css']
})
export class EduInstitutionListComponent implements OnInit {
  eduInstitution: Observable<EduInstitution[]>;
  
  
  constructor(private eduInstitutionserviceService: EduInstitutionserviceService){}
  ngOnInit(): void {
    this.eduInstitutionserviceService.findAll().subscribe(data => {
      this.eduInstitution = data;
    });
  }

}

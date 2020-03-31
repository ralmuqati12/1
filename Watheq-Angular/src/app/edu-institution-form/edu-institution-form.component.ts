import { Component, OnInit } from '@angular/core';
import { EduInstitution } from '../edu-institution';
import { EduInstitutionserviceService } from '../edu-institutionservice.service';

@Component({
  selector: 'app-edu-institution-form',
  templateUrl: './edu-institution-form.component.html',
  styleUrls: ['./edu-institution-form.component.css']
})
export class EduInstitutionFormComponent implements OnInit {
  eduInstitution: EduInstitution = new EduInstitution;
  submitted = false;

 constructor(private eduInstitutionserviceService: EduInstitutionserviceService ) { }

  ngOnInit(): void {

  }
  newEduInstitution(): void {
    this.submitted = false;
    this.eduInstitution = new EduInstitution();
  }
  onSubmit() {
    this.save();
  }

  save() {
    this.eduInstitutionserviceService.save(this.eduInstitution)
      .subscribe(
        data => {
          console.log(data);
          this.submitted = true;
        },
        error => console.log(error));
    this.eduInstitution = new EduInstitution();
  }
}

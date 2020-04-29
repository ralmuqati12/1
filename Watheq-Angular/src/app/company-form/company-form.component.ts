import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { CompanyserviceService } from '../companyservice.service';
import { FormGroup, Validators, FormControl } from '@angular/forms';



@Component({
  selector: 'app-company-form',
  templateUrl: './company-form.component.html',
  styleUrls: ['./company-form.component.css']
})
export class CompanyFormComponent implements OnInit {
  // companyForm: FormGroup;
  company: Company = new Company;
  submitted = false;
  // error : string;
  // confirmPassword = String ; 

 constructor(private companyserviceService: CompanyserviceService ) { }

  ngOnInit(): void {

  }


  // get confirmPasswordValue(){
  //   return this.confirmPassword;
  // }
 
  // get getEmail() {
  //   return this.companyForm.get("email")
  // }
  // get getPhoneNumber() {
  //   return this.companyForm.get("phonenumber")
  // }
  // get getAddress() {
  //   return this.companyForm.get("address")
  // }
  // get getPassword() {
  //   return this.companyForm.get("password")
  // }
  // get getCompanyId() {
  //   return this.companyForm.get("cr")
  // }
  // get getCompanyName() {
  //   return this.companyForm.get("companyname")
  // }

  // confirmpassword(){
  //   let password = this.companyForm.value("password");
  //   let confirmpassword = this.companyForm.value("confirmpassword");
  //   return password === confirmpassword ? null : { notSame: true }  
  
  //  }

  //  private initForm() {
  //   this.companyForm = new FormGroup({
  //     'email': new FormControl(null, [Validators.required, Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")]),
  //     'phonenumber': new FormControl(null, [Validators.maxLength(10), Validators.required , Validators.pattern("^(0)(5)[0-9]{8}$")]),
  //     'address': new FormControl(null, [Validators.required, Validators.pattern("^[a-zA-Z]{3,15}$")]),
  //     'password': new FormControl(null, [Validators.required , Validators.pattern("(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[$@$!%?&])[A-Za-z\d$@$!%?&].{8,}")]),
  //     'eduId': new FormControl(null, [Validators.required , Validators.pattern("[0-9]{8,20}")]),
  //     'name': new FormControl(null, [Validators.required]),
  //     'username': this.getCompanyName,
  //     'userkind': new FormControl("company")
  //   },{updateOn:'blur'});
  // }

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

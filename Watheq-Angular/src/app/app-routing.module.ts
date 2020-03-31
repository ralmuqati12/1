
import { CompanyListComponent } from './company-list/company-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyFormComponent } from './company-form/company-form.component'
import { EduInstitutionFormComponent } from './edu-institution-form/edu-institution-form.component';
import { IndividualFormComponent } from './individual-form/individual-form.component';
import { HomeComponent } from './home/home.component';
import { SingUpComponent } from './sing-up/sing-up.component';

 
const routes: Routes = [
  {path:  "", pathMatch:  "full",redirectTo:"home"},
  {path: "home", component: HomeComponent},
  {path: "SingUp", component: SingUpComponent},
  { path: 'company', component: CompanyListComponent },
  { path: 'companysave', component: CompanyFormComponent },
  { path: 'edusave', component: EduInstitutionFormComponent },
  { path: 'individualsave', component: IndividualFormComponent }


];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }
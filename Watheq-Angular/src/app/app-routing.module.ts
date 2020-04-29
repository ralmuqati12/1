
import { CompanyListComponent } from './company-list/company-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyFormComponent } from './company-form/company-form.component'
import { EduInstitutionFormComponent } from './edu-institution-form/edu-institution-form.component';
import { IndividualFormComponent } from './individual-form/individual-form.component';
import { HomeComponent } from './home/home.component';
import { SingUpComponent } from './sing-up/sing-up.component';
import { LogoutComponent } from './logout/logout.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { SearchComponent } from './search/search.component';
import { AuthorizationGuard } from './authorization.guard';
import { UploadImageComponent } from './upload-image/upload-image.component';

 
const routes: Routes = [
  {path:  "", pathMatch:  "full",redirectTo:"home"},
  {
    path: '',
    canActivateChild: [AuthorizationGuard],
    children: [
      // routes here
    ]
  },
  {path: "home", component: HomeComponent},
  {path: "SingUp", component: SingUpComponent},
  {path: "login", component: LoginComponent},
  { path: 'company', component: CompanyListComponent },
  { path: 'companysave', component: CompanyFormComponent },
  { path: 'edusave', component: EduInstitutionFormComponent },
  { path: 'individualsave', component: IndividualFormComponent },
  { path: 'logout', component: LogoutComponent },
  { path: 'logout', component: LogoutComponent },
  {path: 'search', component: SearchComponent,  data: {
    allowedRoles: [ 'admin']
  } },
  {path: 'uploadimage', component: UploadImageComponent},
  { path: '**', component: NotFoundComponent }
  
  

];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }
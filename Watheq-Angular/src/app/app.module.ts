import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { CompanyListComponent } from './company-list/company-list.component';
import { CompanyFormComponent } from './company-form/company-form.component';
import { CompanyserviceService } from './companyservice.service';
import { FormsModule } from '@angular/forms';
import { EduInstitutionListComponent } from './edu-institution-list/edu-institution-list.component';
import { EduInstitutionFormComponent } from './edu-institution-form/edu-institution-form.component';
import { IndividualListComponent } from './individual-list/individual-list.component';
import { IndividualFormComponent } from './individual-form/individual-form.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { SingUpComponent } from './sing-up/sing-up.component';

@NgModule({
  declarations: [
    AppComponent,
    CompanyListComponent,
    CompanyFormComponent,
    EduInstitutionListComponent,
    EduInstitutionFormComponent,
    IndividualListComponent,
    IndividualFormComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    SingUpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [CompanyserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }

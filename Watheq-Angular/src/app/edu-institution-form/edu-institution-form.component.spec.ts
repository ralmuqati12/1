import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EduInstitutionFormComponent } from './edu-institution-form.component';

describe('EduInstitutionFormComponent', () => {
  let component: EduInstitutionFormComponent;
  let fixture: ComponentFixture<EduInstitutionFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EduInstitutionFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EduInstitutionFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

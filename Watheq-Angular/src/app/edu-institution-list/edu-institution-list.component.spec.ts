import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EduInstitutionListComponent } from './edu-institution-list.component';

describe('EduInstitutionListComponent', () => {
  let component: EduInstitutionListComponent;
  let fixture: ComponentFixture<EduInstitutionListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EduInstitutionListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EduInstitutionListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { EduInstitutionserviceService } from './edu-institutionservice.service';

describe('EduInstitutionserviceService', () => {
  let service: EduInstitutionserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EduInstitutionserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

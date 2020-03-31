import { TestBed } from '@angular/core/testing';

import { IndividualserviceService } from './individualservice.service';

describe('IndividualserviceService', () => {
  let service: IndividualserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IndividualserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

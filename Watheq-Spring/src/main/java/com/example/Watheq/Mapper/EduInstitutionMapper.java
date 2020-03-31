package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.EduInstitutionDTO;
import com.example.Watheq.model.EduInstitution;

public interface  EduInstitutionMapper {
	
	

	EduInstitution dtoToDomain(final EduInstitutionDTO  eduInstitution );

	EduInstitutionDTO domainToDto(final EduInstitution eduInstitution );


}

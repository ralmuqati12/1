package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.EduInstitutionDTO;
import com.example.Watheq.Mapper.EduInstitutionMapper;
import com.example.Watheq.model.EduInstitution;


public class EduInstitutionMapperImp implements EduInstitutionMapper {
	
	ModelMapper modelMapper;

	public EduInstitutionMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public EduInstitution dtoToDomain(EduInstitutionDTO  eduInstitution ) {
		return modelMapper.map(eduInstitution,EduInstitution.class );

	}


	@Override
	public EduInstitutionDTO  domainToDto( EduInstitution eduInstitution ) {
		return modelMapper.map(eduInstitution, EduInstitutionDTO.class );
	}
}
	
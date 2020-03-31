package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.CertificationDTO;
import com.example.Watheq.Mapper.CertificationMapper;
import com.example.Watheq.model.Certification;

public class CertificationMapperImp implements CertificationMapper {
	

	ModelMapper modelMapper;

	public CertificationMapperImp () {
		modelMapper = new ModelMapper();
	}

	@Override
	public Certification dtoToDomain(CertificationDTO certification ) {
		return modelMapper.map(certification,Certification.class );

	}


	@Override
	public CertificationDTO  domainToDto( Certification certification ) {
		return modelMapper.map(certification, CertificationDTO.class );
	}

}

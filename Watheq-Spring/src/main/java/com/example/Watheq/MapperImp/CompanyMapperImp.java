package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.CompanyDTO;
import com.example.Watheq.Mapper.CompanyMapper;
import com.example.Watheq.model.Company;


public class CompanyMapperImp implements CompanyMapper {
	
	
	ModelMapper modelMapper;

	public CompanyMapperImp () {
		modelMapper = new ModelMapper();
	}

	@Override
	public Company dtoToDomain(CompanyDTO  company ) {
		return modelMapper.map(company,Company.class );

	}


	@Override
	public CompanyDTO  domainToDto( Company company ) {
		return modelMapper.map(company, CompanyDTO.class );
	}
}

package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.IndividualDTO;
import com.example.Watheq.Mapper.IndividualMapper;
import com.example.Watheq.model.Individual;

public class IndividualMapperImp  implements IndividualMapper {
	
	ModelMapper modelMapper;

	public IndividualMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Individual dtoToDomain(IndividualDTO  individual ) {
		return modelMapper.map(individual,Individual.class );

	}


	@Override
	public IndividualDTO  domainToDto(Individual individual ) {
		return modelMapper.map(individual, IndividualDTO.class );
	}

}

package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.ExperienceDTO;
import com.example.Watheq.Mapper.ExperienceMapper;
import com.example.Watheq.model.Experience;

public class ExperienceMapperImp implements ExperienceMapper {
	

	ModelMapper modelMapper;

	public ExperienceMapperImp() {
		modelMapper = new ModelMapper();
	}
	@Override
	public Experience dtoToDomain(ExperienceDTO  experience ) {
		return modelMapper.map(experience,Experience.class );

	}

	@Override
	public ExperienceDTO  domainToDto( Experience experience ) {
		return modelMapper.map(experience, ExperienceDTO.class );
	}

}

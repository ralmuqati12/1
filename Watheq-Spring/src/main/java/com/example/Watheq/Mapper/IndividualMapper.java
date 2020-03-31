package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.IndividualDTO;
import com.example.Watheq.model.Individual;

public interface IndividualMapper {
	
	Individual dtoToDomain(final IndividualDTO  individual );

	IndividualDTO domainToDto(final Individual individual );

}

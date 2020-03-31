package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.ExperienceDTO;
import com.example.Watheq.model.Experience;

public interface ExperienceMapper {

	Experience dtoToDomain(final ExperienceDTO  experience );

	ExperienceDTO domainToDto(final Experience experience );
}

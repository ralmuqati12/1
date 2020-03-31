package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.LanguageDTO;
import com.example.Watheq.model.Language;

public interface LanguageMapper {

	Language dtoToDomain(final LanguageDTO  language );

	LanguageDTO domainToDto(final Language language );
}

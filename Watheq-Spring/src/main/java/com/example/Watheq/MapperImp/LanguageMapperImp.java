package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.LanguageDTO;
import com.example.Watheq.Mapper.LanguageMapper;
import com.example.Watheq.model.Language;

public class LanguageMapperImp  implements LanguageMapper {
	
	ModelMapper modelMapper;

	public LanguageMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Language dtoToDomain(LanguageDTO  language ) {
		return modelMapper.map(language,Language.class );

	}


	@Override
	public LanguageDTO  domainToDto( Language language ) {
		return modelMapper.map(language, LanguageDTO.class );
	}

}

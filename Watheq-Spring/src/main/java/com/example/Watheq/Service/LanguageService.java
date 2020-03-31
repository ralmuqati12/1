package com.example.Watheq.Service;

import org.springframework.stereotype.Service;
import com.example.Watheq.DTO.LanguageDTO;
import com.example.Watheq.MapperImp.LanguageMapperImp;
import com.example.Watheq.model.Language;
import com.example.Watheq.repository.LanguageRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageService {
	
	private LanguageRepository languageRepository;
	private static final LanguageMapperImp languageMapperImp = new LanguageMapperImp();
	
	public LanguageDTO createLanguageDTO(LanguageDTO languageDTO) {
		
		Language language = Language.builder()
				.langugeid(languageDTO.getLangugeid())
				.nationalid(languageDTO.getNationalid())
                .langugename(languageDTO.getLangugename())
                .langugedate(languageDTO.getLangugedate())
                .langugerefrenceno(languageDTO.getLangugerefrenceno())
                .langugeattach(languageDTO.getLangugeattach())
                .build();
		
		Language saveLanguage = languageRepository.save(language);
        return languageMapperImp.domainToDto(saveLanguage);
}

}

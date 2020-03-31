package com.example.Watheq.Service;

import org.springframework.stereotype.Service;
import com.example.Watheq.DTO.ExperienceDTO;
import com.example.Watheq.MapperImp.ExperienceMapperImp;
import com.example.Watheq.model.Experience;
import com.example.Watheq.repository.ExperienceRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExperienceService {
	

	private ExperienceRepository experienceRepository;
	private static final ExperienceMapperImp experienceMapperImp = new ExperienceMapperImp();
	
	public ExperienceDTO createexperienceDTO(ExperienceDTO experienceDTO) {
		
		Experience experience = Experience.builder()
				.expid(experienceDTO.getExpid())
                .nationalid(experienceDTO.getNationalid())
                .eduid(experienceDTO.getEduid())
                .exposition(experienceDTO.getExposition())
                .namecompany(experienceDTO.getNamecompany())
                .startdate(experienceDTO.getStartdate())
                .enddate(experienceDTO.getEnddate())
                .addby(experienceDTO.getAddby())
               .refname(experienceDTO.getRefemail())
                .refemail(experienceDTO.getRefemail())
                .build();
		
		Experience saveExperience = experienceRepository.save(experience);
        return experienceMapperImp.domainToDto(saveExperience);
}

}

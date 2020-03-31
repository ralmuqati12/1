package com.example.Watheq.Service;

import org.springframework.stereotype.Service;
import com.example.Watheq.DTO.RecommendationDTO;
import com.example.Watheq.MapperImp.RecommendationMapperImp;
import com.example.Watheq.model.Recommendation;
import com.example.Watheq.repository.RecommendationRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RecommendationService {
	

	private RecommendationRepository recommendationRepository;
	private static final RecommendationMapperImp recommendationMapperImp = new RecommendationMapperImp();
	
	public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {
		
		Recommendation recommendation = Recommendation.builder()
				.recoid(recommendationDTO.getRecoid())
                .nationalid(recommendationDTO.getNationalid())
                .eduid(recommendationDTO.getEduid())
                .cr(recommendationDTO.getCr())
               .recofrom(recommendationDTO.getRecofrom())
                .recodate(recommendationDTO.getRecodate())
                .recoaddby(recommendationDTO.getRecoaddby())
                .recoattach(recommendationDTO.getRecoattach())
                .recoinstitutename(recommendationDTO.getRecoinstitutename())
                .build();
		
		Recommendation saveRecommendation = recommendationRepository.save(recommendation);
        return recommendationMapperImp.domainToDto(saveRecommendation);
}

}

package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.RecommendationDTO;
import com.example.Watheq.model.Recommendation;

public interface RecommendationMapper {
	
	 Recommendation dtoToDomain(final  RecommendationDTO   recommendation );

	 RecommendationDTO domainToDto(final  Recommendation  recommendation );

}

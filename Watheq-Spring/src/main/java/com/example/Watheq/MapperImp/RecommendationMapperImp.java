package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.RecommendationDTO;
import com.example.Watheq.Mapper.RecommendationMapper;
import com.example.Watheq.model.Recommendation;

public class RecommendationMapperImp implements RecommendationMapper {
	

	ModelMapper modelMapper;

	public RecommendationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Recommendation dtoToDomain(RecommendationDTO  recommendation ) {
		return modelMapper.map(recommendation,Recommendation.class );

	}


	@Override
	public RecommendationDTO  domainToDto( Recommendation recommendation ) {
		return modelMapper.map(recommendation, RecommendationDTO.class );
	}

}

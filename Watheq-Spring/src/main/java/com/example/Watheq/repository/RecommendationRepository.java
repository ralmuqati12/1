package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Recommendation;

@Transactional
@Repository
public interface RecommendationRepository extends CrudRepository <Recommendation, String> {
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.recofrom = :recofrom WHERE recommendation.recoid = :recoid ")
	void updaterecofrom(@Param("recoid")String recoid, @Param("recofrom") String recofrom );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.recodate = :recodate WHERE recommendation.recoid = :recoid ")
	void updaterecodate(@Param("recoid")String recoid, @Param("recodate") String recodate );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.recoaddby = :recoaddby WHERE recommendation.recoid = :recoid ")
	void updaterecoaddby(@Param("recoid")String recoid, @Param("recoaddby") String recoaddby );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.recoattach = :recoattach WHERE recommendation.recoid = :recoid ")
	void updaterecoattach(@Param("recoid")String recoid, @Param("recoattach") String recoattach );
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.recoinstitutename = :recoinstitutename WHERE recommendation.recoid = :recoid ")
	void updaterecoinstitutename(@Param("recoid")String recoid, @Param("recoinstitutename") String recoinstitutename );

}

package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Certification;

@Transactional
@Repository
public interface CertificationRepository  extends CrudRepository <Certification, String> {
	
	

	@Modifying
	@Query("UPDATE Certification certificatio SET certificatio.addby = :addby WHERE certificatio.cer_id = :cer_id ")
	void updateaddby(@Param("cer_id")String cer_id, @Param("addby") String addby );
	
	@Modifying
	@Query("UPDATE Certification certificatio SET certificatio.certdate = :certdate WHERE certificatio.cer_id = :cer_id ")
	void updatecertdate(@Param("cer_id")String cer_id, @Param("certdate") String certdate );
	
	@Modifying
	@Query("UPDATE Certification certificatio SET certificatio.gba = :gba WHERE certificatio.cer_id = :cer_id ")
	void updategba(@Param("cer_id")String cer_id, @Param("gba") String gba );
	
	@Modifying
	@Query("UPDATE Certification certificatio SET certificatio.degree = :degree WHERE certificatio.cer_id = :cer_id ")
	void updatedegree(@Param("cer_id")String cer_id, @Param("degree") String degree );
	
	@Modifying
	@Query("UPDATE Certification certificatio SET certificatio.major = :major WHERE certificatio.cer_id = :cer_id ")
	void updatemajor(@Param("cer_id")String cer_id, @Param("major") String major );
	
	@Modifying
	@Query("UPDATE Certification certificatio SET certificatio.cerattach = :cerattach WHERE certificatio.cer_id = :cer_id ")
	void updatecerattach(@Param("cer_id")String cer_id, @Param("cerattach") String cerattach );
}

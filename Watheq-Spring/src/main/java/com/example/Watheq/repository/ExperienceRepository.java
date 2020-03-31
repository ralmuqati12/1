package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Experience;



@Transactional
@Repository
public interface ExperienceRepository  extends CrudRepository <Experience, String> {
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.exposition = :exposition WHERE experience.expid = :expid ")
	void updateexosition(@Param("expid")String expid, @Param("exposition") String exposition );
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.namecompany = :namecompany WHERE experience.expid = :expid ")
	void updatenamecompany(@Param("expid")String expid, @Param("namecompany") String namecompany );
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.startdate = :startdate WHERE experience.expid = :expid ")
	void updatestartdate(@Param("expid")String expid, @Param("startdate") String startdate );
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.enddate = :enddate WHERE experience.expid = :expid ")
	void updateenddate(@Param("expid")String expid, @Param("enddate") String enddate );
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.addby = :addby WHERE experience.expid = :expid ")
	void updateaddby(@Param("expid")String expid, @Param("addby") String addby );
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.refname = :refname WHERE experience.expid = :expid ")
	void updaterefname(@Param("expid")String expid, @Param("refname") String refname );
	
	@Modifying
	@Query("UPDATE Experience experience SET experience.refemail = :refemail WHERE experience.expid = :expid ")
	void updaterefemail(@Param("expid")String expid, @Param("refemail") String refemail );

}

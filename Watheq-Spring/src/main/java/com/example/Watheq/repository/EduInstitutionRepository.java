package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.EduInstitution;

@Transactional
@Repository
public interface EduInstitutionRepository extends CrudRepository <EduInstitution, String> {

	

	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.email = :email WHERE eduInstitution.eduid = :eduid ")
	void updateemail(@Param("eduid")String eduid, @Param("email") String email );
	
	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.phonenumber = :phonenumber WHERE eduInstitution.eduid = :eduid ")
	void updatephonenumber(@Param("eduid")String eduid, @Param("phonenumber") String phonenumber );
	
	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.password = :password WHERE eduInstitution.eduid = :eduid ")
	void updatepassword(@Param("eduid")String eduid, @Param("password") String password );
	
	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.eduname = :eduname WHERE eduInstitution.eduid = :eduid ")
	void updateeduname(@Param("eduid")String eduid, @Param("eduname") String eduname );
}

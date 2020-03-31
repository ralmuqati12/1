package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Individual;


@Transactional
@Repository
public interface Individualrepository extends  CrudRepository <Individual, String>{
    // List<Customer> findByLastName(String lastName);
	
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.email = :email WHERE individual.nationalid = :nationalid ")
	void updateemail(@Param("nationalid")String nationalid, @Param("email") String email );
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.phonenumber = :phonenumber WHERE individual.nationalid = :nationalid ")
	void updatephonenumber(@Param("nationalid")String nationalid, @Param("phonenumber") String phonenumber);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.address = :address WHERE individual.nationalid = :nationalid ")
	void updateaddressr(@Param("nationalid")String nationalid, @Param("address") String address);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.password = :password WHERE individual.nationalid = :nationalid ")
	void updatepassword(@Param("nationalid")String nationalid, @Param("password") String password);
	
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.firstname = :firstname WHERE individual.nationalid = :nationalid ")
	void updatefirstname(@Param("nationalid")String nationalid, @Param("firstname") String firstname);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.firstname = :middlename WHERE individual.nationalid = :nationalid ")
	void updatemiddlename(@Param("nationalid")String nationalid, @Param("middlename") String middlename);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.lastname = :lastname WHERE individual.nationalid = :nationalid ")
	void updatelastname(@Param("nationalid")String nationalid, @Param("lastname") String lastname);
	

	@Modifying
	@Query("UPDATE Individual individual SET individual.status = :status WHERE individual.nationalid = :nationalid ")
	void updateStatus(@Param("nationalid")String nationalid, @Param("status") String status );
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.dob = :dob WHERE individual.nationalid = :nationalid ")
	void updatedob(@Param("nationalid")String nationalid, @Param("dob") String dob);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.skills = :skills WHERE individual.nationalid = :nationalid ")
	void updateskills(@Param("nationalid")String nationalid, @Param("skills") String skills);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.major = :major WHERE individual.nationalid = :nationalid ")
	void updatemajor(@Param("nationalid")String nationalid, @Param("major") String major);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.attachments = :attachments WHERE individual.nationalid = :nationalid ")
	void updateattachments(@Param("nationalid")String nationalid, @Param("attachments") String attachments);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.jop = :jop WHERE individual.nationalid = :nationalid ")
	void updatejop(@Param("nationalid")String nationalid, @Param("jop") String jop);
	
	
}

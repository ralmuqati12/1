package com.example.Watheq.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Company;


@Transactional
@Repository
public interface CompanyRepository  extends CrudRepository <Company, String> {
	
	@Modifying
	@Query("UPDATE Company company SET company.email = :email WHERE company.cr = :cr ")
	void updateemail(@Param("cr")String cr, @Param("email") String email );
	
	@Modifying
	@Query("UPDATE Company company SET company.phonenumber = :phonenumber WHERE company.cr = :cr ")
	void updatephonenumber(@Param("cr")String cr, @Param("phonenumber") String phonenumber );
	
	@Modifying
	@Query("UPDATE Company company SET company.address = :address WHERE company.cr = :cr ")
	void updateaddress(@Param("cr")String cr, @Param("address") String address );
	
	@Modifying
	@Query("UPDATE Company company SET company.password = :password WHERE company.cr = :cr ")
	void updatepassword(@Param("cr")String cr, @Param("password") String password );
	
	@Modifying
	@Query("UPDATE Company company SET company.companyname = :companyname WHERE company.cr = :cr ")
	void updatecompanyname(@Param("cr")String cr, @Param("companyname") String companyname );
	
	@Modifying
	@Query("UPDATE Company company SET company.startdate = :startdate WHERE company.cr = :cr ")
	void updatestartdate(@Param("cr")String cr, @Param("startdate") String startdate );
	
	@Modifying
	@Query("UPDATE Company company SET company.enddate = :enddate WHERE company.cr = :cr ")
	void updateenddate(@Param("cr")String cr, @Param("enddate") String enddate );
	
	 
	}
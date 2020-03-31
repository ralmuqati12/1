package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Language;

@Transactional
@Repository
public interface LanguageRepository extends CrudRepository <Language, String> {
	
	@Modifying
	@Query("UPDATE Language language SET language.langugename = :langugename WHERE language.langugeid = :langugeid ")
	void updatelangugename(@Param("langugeid")String langugeid, @Param("langugename") String langugename );
	
	@Modifying
	@Query("UPDATE Language language SET language.langugedate = :langugedate WHERE language.langugeid = :langugeid ")
	void updatelangugedate(@Param("langugeid")String langugeid, @Param("langugedate") String langugedate );
	
	@Modifying
	@Query("UPDATE Language language SET language.langugerefrenceno = :langugerefrenceno WHERE language.langugeid = :langugeid ")
	void updatelangugerefrenceno(@Param("langugeid")String langugeid, @Param("langugerefrenceno") String langugerefrenceno );
	
	@Modifying
	@Query("UPDATE Language language SET language.langugeattach = :langugeattach WHERE language.langugeid = :langugeid ")
	void updatelangugeattach(@Param("langugeid")String langugeid, @Param("langugeattach") String langugeattach );

}

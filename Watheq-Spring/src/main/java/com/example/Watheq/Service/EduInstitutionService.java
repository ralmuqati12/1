package com.example.Watheq.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.Watheq.DTO.EduInstitutionDTO;
import com.example.Watheq.ExceptionHandling.NotFoundException;
import com.example.Watheq.MapperImp.EduInstitutionMapperImp;
import com.example.Watheq.model.EduInstitution;
import com.example.Watheq.repository.EduInstitutionRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EduInstitutionService {

	@Autowired
	EduInstitutionRepository eduInstitutionRepository;
	
	private static final EduInstitutionMapperImp eduInstitutionMapperImp = new EduInstitutionMapperImp ();

	public ResponseEntity<EduInstitution> createEduInstitutionDTO(EduInstitutionDTO eduInstitutionDTO) {

		EduInstitution eduInstitution = EduInstitution.builder()
				.email(eduInstitutionDTO.getEmail())
				.phonenumber(eduInstitutionDTO.getPhonenumber())
				.address(eduInstitutionDTO.getAddress())
				.password(eduInstitutionDTO.getPassword())
				.eduid(eduInstitutionDTO.getEduid())
				.eduname(eduInstitutionDTO.getEduname())
				.build();

		EduInstitution saveEduInstitution = eduInstitutionRepository.save(eduInstitution);
         eduInstitutionMapperImp.domainToDto(saveEduInstitution);
        return new ResponseEntity<>(saveEduInstitution, HttpStatus.CREATED);
        
	}
	
	 public ResponseEntity<List<EduInstitution>> getEdu(){
		 List<EduInstitution> com = new ArrayList<EduInstitution>();
		 eduInstitutionRepository.findAll().forEach(com::add);
	        return new ResponseEntity<>(com , HttpStatus.OK);
	 }
	 
	 

	
public EduInstitutionDTO updatepassword(String eduid, String password){
	try { 
	eduInstitutionRepository.updatepassword(eduid, password);
	return eduInstitutionRepository.findById(eduid)
			 .map(eduInstitutionMapperImp::domainToDto).get(); 
	}catch (NoSuchElementException ex)
	{
		throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", eduid ));
	
	}}
	public List<EduInstitution> findAll() {
		// TODO Auto-generated method stub
		return (List<EduInstitution>) eduInstitutionRepository.findAll();
	}





}





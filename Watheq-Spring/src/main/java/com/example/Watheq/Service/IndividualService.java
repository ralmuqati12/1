package com.example.Watheq.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.Watheq.DTO.IndividualDTO;
import com.example.Watheq.MapperImp.IndividualMapperImp;
import com.example.Watheq.model.Individual;
import com.example.Watheq.repository.Individualrepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IndividualService {
	
	private Individualrepository individualrepository;
	private static final IndividualMapperImp individualmapperImp = new IndividualMapperImp();
	
	public ResponseEntity<Individual> createIndividualDTO(IndividualDTO individualDTO) {
		
		Individual individual = Individual.builder()
				.email(individualDTO.getEmail())
                .phonenumber(individualDTO.getPhonenumber())
                .address(individualDTO.getAddress())
                .password(individualDTO.getPassword())
                .nationalid(individualDTO.getNationalid())
                .firstname(individualDTO.getFirstname())
                .middlename(individualDTO.getMiddlename())
                .lastname(individualDTO.getLastname())
                .gender(individualDTO.getGender())
                .status(individualDTO.getStatus())
                .skills(individualDTO.getSkills())
                .dob(individualDTO.getDob())
                .major(individualDTO.getMajor())
                .attachments(individualDTO.getAttachments())
                .jop(individualDTO.getJop())
                .build();
		
		Individual saveIndividual = individualrepository.save(individual);
         individualmapperImp.domainToDto(saveIndividual);
         return new ResponseEntity<>(saveIndividual, HttpStatus.CREATED);
        
    }
	 public ResponseEntity<List<Individual>> getIndividual(){
		 List<Individual> com = new ArrayList<Individual>();
		 individualrepository.findAll().forEach(com::add);
	        return new ResponseEntity<>(com , HttpStatus.OK);
	 }
	 public List<Individual> findAll() {
			// TODO Auto-generated method stub
			return (List<Individual>) individualrepository.findAll();
		}

}

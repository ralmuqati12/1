 package com.example.Watheq.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Watheq.DTO.CompanyDTO;
import com.example.Watheq.ExceptionHandling.NotFoundException;
import com.example.Watheq.MapperImp.CompanyMapperImp;
import com.example.Watheq.model.Company;
import com.example.Watheq.repository.CompanyRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyService {
	
	private CompanyRepository companyRepository;
	private static final CompanyMapperImp companyMapperImp = new CompanyMapperImp();
	
	public ResponseEntity<Company> createCompanyDTO(CompanyDTO companyDTO) {
		
		Company company = Company.builder()
				.email(companyDTO.getEmail())
                .phonenumber(companyDTO.getPhonenumber())
                .address(companyDTO.getAddress())
                .password(companyDTO.getPassword())
                .cr(companyDTO.getCr())
                .companyname(companyDTO.getCompanyname())
                .startdate(companyDTO.getStartdate())
                .enddate(companyDTO.getEnddate())
               
                .build();
		
		Company saveCompany = companyRepository.save(company);
        companyMapperImp.domainToDto(saveCompany);
        return new ResponseEntity<>(saveCompany, HttpStatus.CREATED);
     
        
   
    }
	
	 public ResponseEntity<List<Company>> getCompanis(){
		 List<Company> com = new ArrayList<Company>();
		 companyRepository.findAll().forEach(com::add);
	        return new ResponseEntity<>(com , HttpStatus.OK);
	 }
	
//	  public CompanyDTO getByCR(String cr) {
//	        try {
//	            return companyRepository.findById(cr)
//	            .map(companyMapperImp::domainToDto).get();
//	        }catch (NoSuchElementException ex) {
//	            throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
//	        }
//	      
//	    }
//	  
		public ResponseEntity<Company> getByCR(String cr) {
			try {
				Company company = companyRepository.findById(cr).get();
				return new ResponseEntity<>(company , HttpStatus.OK);

			}
			catch (NoSuchElementException ex) {
				throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
			}
		}
		
//		}
//	  public Company deleteByCr(String cr) {
//		  
//		  Company company = findByCr(cr);
//		  if (company ==null ) return null;
//		  if (company.remove(company)) {
//		  return company;}
//		  return null;
//	  }
	  
	  
	  
	  
	  
	  
	  
//public  Company findByCr(String cr) {
//	for (Company company: company) {
//		if (company.getCr() == cr) {
//			return company;
//		}
//	}
//		return null;
//	}

//	    public Company delete(String cr) {
//	        Company company = findById(cr);
//	        if(company != null){
//	        	companyRepository.delete(company);
//	        }
//	        return company;
//	    }
//	    
//	    public Company findById(String cr) {
//	        return companyRepository.findOne(cr);
//	    }

		
		

	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return (List<Company>) companyRepository.findAll();
	}





}

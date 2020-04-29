package com.example.Watheq.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Watheq.DTO.CompanyDTO;
import com.example.Watheq.ExceptionHandling.ResourceNotFoundException;
import com.example.Watheq.Service.CompanyService;
import com.example.Watheq.model.Company;
import com.example.Watheq.repository.CompanyRepository;

@RestController
// @EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CompanyController {
	

	@Autowired
	CompanyService companyService;
	CompanyRepository companyRepository;

	
	
	
	// CompanyDTO companyDTO = new CompanyDTO ("ujyfytiy@elm.sa","0574444444" , "Riyadhtduhgh", "8987667","98004", "Elum", Timestamp.valueOf("1999-09-22 04:15:09.249"), Timestamp.valueOf("1998-09-22 04:15:09.249"));
//	
//	@PostMapping("/ComCreate")
//	public String save(@RequestBody CompanyDTO company)
//	{
//		companyService.createCompanyDTO(company);
//		return "Create Done";
//		
//	}
	
	   @PostMapping(value="/companysave")
	   public ResponseEntity<Company> save(@RequestBody CompanyDTO companyDTO){
		   System.out.println("company save call");
		  return companyService.createCompanyDTO(companyDTO); 
}
	
	@RequestMapping("/FindCompany")
  
     public String FindbyID() throws Exception{
  
      companyService.getByCR("11");
	  return "Find Comppany";
	  
	  }
	
//	 @GetMapping("/company")
//    public List<Company> Company() {
//       return (List<Company>) companyService.findAll();
//	    }
	 
	  @GetMapping("/company")
	    public ResponseEntity<List<Company>> getCompanes() {
		  return companyService.getCompanis();
	    }
	 
	  @GetMapping(value= "/companyse/{cr}")
		ResponseEntity<Company> one(@PathVariable String cr) {
			return companyService.getByCR(cr);
		} 
	  
	  
	  
	  
//	  @DeleteMapping(path="/companies/{cr}")
//	  public ResponseEntity<Void> deletecompany(@PathVariable String cr){
//		  Company company = companyService.deleteByCr(cr);
//		  if (company != null) {
//          return ResponseEntity.noContent().build();
//	  }	  
//	  
//	  return ResponseEntity.notFound().build();
//	  }
//	  
	  
//	  @DeleteMapping(path ={"/{cr}"})
//	    public Company delete(@PathVariable("cr") String cr) {
//	        return companyService.delete(cr);
//	    }
//	  
//	  @GetMapping(path = {"/{cr}"})
//	    public Company findById(@PathVariable("cr") String cr){
//	        return companyService.findById(cr);
//	    }
	  
//	  @DeleteMapping("/Companies/{CRR}")
//	  public Map<String, Boolean> deleteCompany(@PathVariable(value = "CRR") String CRR)
//	       throws ResourceNotFoundException {
//	  	Company company = companyRepository.findById(CRR)
//	     .orElseThrow(() -> new ResourceNotFoundException("Comany not found for this CRR :: " + CRR));
//
//	  	companyRepository.delete(company);
//	      Map<String, Boolean> response = new HashMap<>();
//	      response.put("deleted", Boolean.TRUE);
//	      return response;
//	  }
	  
//	  @DeleteMapping("/employees/{CRR}")
//	  public Map<String, Boolean> deleteEmployee(@PathVariable(value = "CRR") String CRR)
//	       throws ResourceNotFoundException {
//	  	Company company = companyRepository.findById(CRR)
//	     .orElseThrow(() -> new ResourceNotFoundException("Comany not found for this CRR :: " + CRR));
//
//	  	companyRepository.delete(company);
//	      Map<String, Boolean> response = new HashMap<>();
//	      response.put("deleted", Boolean.TRUE);
//	      return response;
//	  }

	    
//	    @PostMapping("/Compannies")
//	    void addCompany(@RequestBody Company company) {
//	    	companyService.save(company);
//	    }
//	

//	@Autowired
//	CompanyRepository Comrepository;
//      
//    @RequestMapping("/Com.save")
//    public String process(){
//    	
//  
//
//Comrepository.save(new Company("uuu","hhhh" , "hh", "hgh","hh", "gg", Timestamp.valueOf("2013-18-10 09:02:888"), Timestamp.valueOf("2018-19-23 09:02:07:1289"))); 
//        return "Done";
//    }
}

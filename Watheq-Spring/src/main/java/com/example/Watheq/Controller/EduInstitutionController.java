package com.example.Watheq.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Watheq.DTO.EduInstitutionDTO;
import com.example.Watheq.Service.EduInstitutionService;
import com.example.Watheq.model.EduInstitution;


//@SpringBootApplication
@RestController
//@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class EduInstitutionController {
	
	
	@Autowired
	EduInstitutionService eduInstitutionService;
	// EduInstitutionDTO eduInstitutionDTO = new EduInstitutionDTO ("pnu@gmail.com","0531824338","Riyadh","1234567866","4567","pnu");
	
//	@RequestMapping("/EduCreate")
//	public String  createprocess()
//	{
//		eduInstitutionService.createEduInstitutionDTO(eduInstitutionDTO);
//		return "Create Done";
//		
//	}
	   @PostMapping(value="/edusave")
	   public ResponseEntity<EduInstitution> save(@RequestBody EduInstitutionDTO eduInstitutionDTO){
		   System.out.println("edu save call");
		  return eduInstitutionService.createEduInstitutionDTO(eduInstitutionDTO); 
}
	
	   @GetMapping("/EduInstitution")
	    public ResponseEntity<List<EduInstitution>> getEdu() {
		  return eduInstitutionService.getEdu();
	    }
//	 @RequestMapping("/updateedu")
//	public String update() {
//	
//	 eduInstitutionService.updateEduemail("4567", "divo");
//	return "Update Done";
//}
	@RequestMapping("/updateedu")
	public EduInstitutionDTO updateEduInstitution() throws Exception
	
	{
		return eduInstitutionService.updatepassword("4567", "76543210");
		
	}


	
	 
//
//	@Autowired
//	EduInstitutionRepository Edurepository;
//      
//    @RequestMapping("/Edu.save")
//    public String process(){
//    	
//  
//
////repository.save(new EduInstitution("Pnu7ydyyyy@edu.sa","346y5d67yy788" , "riydy6yyadh", "pnyudpyy6ass","123d4y56yy67", "pdnyy6yu")); 
//   Edurepository.save(new EduInstitution("irt","irr" , "qiq", "rrirr","qqiqqq", "ggggiigggg")); 
//    	
//    	
//        return "Done Edu";
//    } 
//
//	 @RequestMapping("/updatepass")
//	public String update() {
//		
//		 Edurepository.updateemail("qqiqqq", "divo");
//		return "Update Done"; 
//	}
	 


}

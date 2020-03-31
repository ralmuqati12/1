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
import com.example.Watheq.DTO.IndividualDTO;
import com.example.Watheq.Service.IndividualService;
import com.example.Watheq.model.Individual;

//@SpringBootApplication
@RestController
//@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class IndividualController {


	@Autowired
	IndividualService individualService;

	@PostMapping(value="/individualsave")
	public ResponseEntity<Individual> save(@RequestBody IndividualDTO individualDTO){
		System.out.println("company save call");
		return individualService.createIndividualDTO(individualDTO); 
	}
	  @GetMapping("/individual")
	    public ResponseEntity<List<Individual>> getIndividual() {
		  return individualService.getIndividual();
	    }
		// IndividualDTO individualDTO = new IndividualDTO ("Ghada@gmail.com","0531824338","jeedah","9898","1099999999","ghada","Dkhaile","aljbreen","feemale","Sinngle","programming",Timestamp.valueOf("1999-09-22 04:15:09.249"),"CSs","urrl","unnemp");

		//	@RequestMapping("/IndCreate")
		//	public String  createprocess()
		//	{
		//		individualService.createIndividualDTO(individualDTO);
		//		return "Create Done";
		//		
		//	}
		//	

		//String email, String phone_number, String address, String password, String nationalid, String firstName, String mname, String lastName, String gender, String status,
		//String skills, Timestamp dob, String major, String attachments, String jop


		//	@Autowired
		//	Individualrepository Indrepository;
		//
		//	@RequestMapping("/Indsave")
		//	public String process(){
		//
		//
		//
		//		// repository.save(new Individual("090t90","989t89" , "ghgd", "dhtdhd","789tt834688", "sastta", "ifttkb","57tt43" , "bnttnb", "dsdttsd","lkttlkl", Timestamp.valueOf("2018-11-12 01:02:03.123459"),"jthjhjh","satsdf", "vbtvbv"));
		//		//Indrepository.save(new Individual("DDuD", "yDD", "FuuFF", "FurF","ErR","EuE", "TTuEG","WRQmWET","WRmET", "WmE","WmEE",Timestamp.valueOf("1989-08-22 07:03:09.2234l9"),"RlR","wwl","44l4"));
		//		return "Done";
		//	}
		//
		//	//String email, String phone_number, String address, String password, String nationalid, String firstName, String mname, String lastName, String gender, String status,
		////	String skills, Timestamp dob, String major, String attachments, String jop
		//
		//	/* @RequestMapping("/updateind")
		//	public String update() {
		//		
		//		Indrepository.updateStatus("ER", "divo");
		//		return "Update Done";
		//	}
		//	 */
		//	
		//	
		//	/*
		//    @RequestMapping("/findall")
		//    public String findAll(){
		//        String result = "<html>";
		//
		//        for(Individual cust : repository.findAll()){
		//            result += "<div>" + cust.toString() + "</div>";
		//        }
		//
		//        return result + "</html>";
		//    } */
	}


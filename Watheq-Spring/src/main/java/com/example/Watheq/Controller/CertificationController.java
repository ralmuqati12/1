package com.example.Watheq.Controller;

import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Watheq.DTO.CertificationDTO;
import com.example.Watheq.Service.CertificationService;



@RestController
public class CertificationController {
	@Autowired
CertificationService certificationService;
//Individual individual = new Individual("1099999999");
//EduInstitution eduInstitution = new EduInstitution("4567");
//	
	CertificationDTO certificationDTO = new CertificationDTO("1223", "1099999999", "4567" ,"Prnu","rRR", Timestamp.valueOf("1999-09-22 04:15:09.249"), 4.2, "exf", "Csf","urfl");

	@RequestMapping("/CerCreate")
	public String  createprocess()
	{
	certificationService.createCertificationDTO(certificationDTO);
	return "Create Done";
		
	}}



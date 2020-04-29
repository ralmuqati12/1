package com.example.Watheq.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Watheq.DTO.CertificationDTO;
import com.example.Watheq.Service.CertificationService;
import com.example.Watheq.repository.CertificationRepository;
import com.sun.xml.txw2.Document;

import antlr.StringUtils;
import antlr.collections.List;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CertificationController {
	
	 private static String UPLOADED_FOLDER = "F://temp//";
	@Autowired
CertificationService certificationService;
	CertificationRepository certificationRepository;
//Individual individual = new Individual("1099999999");
//EduInstitution eduInstitution = new EduInstitution("4567");
//	
	CertificationDTO certificationDTO = new CertificationDTO("1223", "1099999999", "4567" ,"Prnu","rRR", Timestamp.valueOf("1999-09-22 04:15:09.249"), 4.2, "exf", "Csf","urfl");

	@RequestMapping("/CerCreate")
	public String  createprocess()
	{
	certificationService.createCertificationDTO(certificationDTO);
	return "Create Done";
		
	}

//	 @GetMapping("/")
//	    public String index() {
//	        return "upload";
//	    }
//
//	@PostMapping("/upload")
//	public ModelAndView fileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
//
//		if (file.isEmpty()) {
//			return new ModelAndView("status", "message", "Please select a file and try again");
//		}
//
//		try {
//			// read and write the file to the selected location-
//			byte[] bytes = file.getBytes();
//			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
//			Files.write(path, bytes);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		return new ModelAndView("status", "message", "File Uploaded sucessfully");
//	 }
//	
//	@PostMapping("/upload")
//	public ResponseEntity uploadFile(@RequestParam("file") MultipartFile file) {
//		certificationService.consumFile(file);
//		return ResponseEntity.ok().build();
//		
	//}



	
	
	 
}
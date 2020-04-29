package com.example.Watheq.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Watheq.DTO.CertificationDTO;
import com.example.Watheq.MapperImp.CertificationMapperImp;
import com.example.Watheq.model.Certification;
import com.example.Watheq.repository.CertificationRepository;

import antlr.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Value;

@Service
@AllArgsConstructor
public class CertificationService {

	private CertificationRepository certificationRepository;
	private static final CertificationMapperImp certificationMapperImp = new CertificationMapperImp();
	
	public CertificationDTO createCertificationDTO(CertificationDTO certificationDTO) {
		
		Certification certification = Certification.builder()
				.cer_id(certificationDTO.getCer_id())
                .nationalid(certificationDTO.getNationalid())
                .eduid(certificationDTO.getEduid())
                .uni_name(certificationDTO.getUni_name())
                .addby(certificationDTO.getAddby())
                .certdate(certificationDTO.getCertdate())
                .gba(certificationDTO.getGba())
                .degree(certificationDTO.getDegree())
                .major(certificationDTO.getMajor())
                .cerattach(certificationDTO.getCerattach())
                .build();
		
		Certification saveCertification = certificationRepository.save(certification);
        return certificationMapperImp.domainToDto(saveCertification);
}
	
//	public void consumFile (MultipartFile uploadedFile) {
//    try (InputStreamReader isr = new InputStreamReader(uploadedFile.getInputStream());
//    		Stream<String> lines = new BufferedReader(isr).lines()){
//    	lines.collect(Collectors.toList()).forEach(line -> System.out.println(line));
//    }
//    catch (IOException ex) {
//    	throw new RuntimeException(ex.getMessage(), ex);
//    }
//	}
}
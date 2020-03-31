package com.example.Watheq.Service;

import org.springframework.stereotype.Service;

import com.example.Watheq.DTO.CertificationDTO;
import com.example.Watheq.MapperImp.CertificationMapperImp;
import com.example.Watheq.model.Certification;
import com.example.Watheq.repository.CertificationRepository;
import lombok.AllArgsConstructor;

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
}
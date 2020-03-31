package com.example.Watheq.Mapper;

import com.example.Watheq.model.Certification;
import com.example.Watheq.DTO.CertificationDTO;


public interface CertificationMapper {

	Certification dtoToDomain(final CertificationDTO certification);

	CertificationDTO domainToDto(final Certification certification);


}

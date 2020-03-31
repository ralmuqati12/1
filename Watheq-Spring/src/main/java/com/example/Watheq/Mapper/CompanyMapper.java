package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.CompanyDTO;
import com.example.Watheq.model.Company;

public interface CompanyMapper {

	Company dtoToDomain(final CompanyDTO  company );

	CompanyDTO domainToDto(final Company company );

	
}

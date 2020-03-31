package com.example.Watheq.MapperTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.example.Watheq.DTO.EduInstitutionDTO;
import com.example.Watheq.MapperImp.EduInstitutionMapperImp;
import com.example.Watheq.model.EduInstitution;

public class EduInstitutionMapperTest {
	
	private static final EduInstitutionMapperImp individualMapper = new EduInstitutionMapperImp();

	@Test
	public void EduInstitutionMapper_domainToDto() {
		final EduInstitutionDTO source =new EduInstitutionDTO ();

		source.setEduid("W");
		source.setEduname("W");
		
		final EduInstitution target = individualMapper.dtoToDomain(source);
		Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getEduname());
		Assert.assertEquals("W", target.getEduid());
		

	}

	@Test
	public void EduInstitutionMapper_dtoToDomain() {
		final EduInstitution source =new EduInstitution();

		
		source.setEduid("W");
		source.setEduname("W");
		

		final EduInstitutionDTO target = individualMapper.domainToDto(source);

		Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getEduid());
		Assert.assertEquals("W", target.getEduname());
		



	}

	
	
}


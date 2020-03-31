package com.example.Watheq.Mapper;

import com.example.Watheq.DTO.CourseDTO;
import com.example.Watheq.model.Course;

public interface CourseMapper {
	
	 Course dtoToDomain(final  CourseDTO  course );

	 CourseDTO domainToDto(final  Course  course );

}

package com.example.Watheq.MapperImp;

import org.modelmapper.ModelMapper;

import com.example.Watheq.DTO.CourseDTO;
import com.example.Watheq.Mapper.CourseMapper;
import com.example.Watheq.model.Course;


public class CourseMapperImp implements CourseMapper {
	
	ModelMapper modelMapper;

	public CourseMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Course dtoToDomain(CourseDTO  course ) {
		return modelMapper.map(course,Course.class );

	}


	@Override
	public CourseDTO  domainToDto( Course course ) {
		return modelMapper.map(course, CourseDTO.class );
	}

}

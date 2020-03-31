package com.example.Watheq.Service;

import org.springframework.stereotype.Service;
import com.example.Watheq.DTO.CourseDTO;
import com.example.Watheq.MapperImp.CourseMapperImp;
import com.example.Watheq.model.Course;
import com.example.Watheq.repository.CourseRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {
	private CourseRepository courseRepository;
	private static final CourseMapperImp courseMapperImp = new CourseMapperImp();
	
	public CourseDTO createCourseDTO(CourseDTO courseDTO) {
		
		Course course = Course.builder()
				.courseid(courseDTO.getCourseid())
                .nationalid(courseDTO.getNationalid())
                .eduid(courseDTO.getEduid())
                .cr(courseDTO.getCr())
                .namecourse(courseDTO.getNamecourse())
                .addedby(courseDTO.getAddedby())
                .nameinstittion(courseDTO.getNameinstittion())
                .courseattch(courseDTO.getCoursesttch())
                .startdate(courseDTO.getStartdate())
                .enddate(courseDTO.getEnddate())
                .build();
		
		Course saveCourse = courseRepository.save(course);
        return courseMapperImp.domainToDto(saveCourse);
}

}

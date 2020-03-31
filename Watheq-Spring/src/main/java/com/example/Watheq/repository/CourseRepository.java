package com.example.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Watheq.model.Course;

@Transactional
@Repository
public interface CourseRepository extends CrudRepository <Course, String> {

	@Modifying
	@Query("UPDATE Course course SET course.namecourse = :namecourse WHERE course.courseid = :courseid ")
	void updatenamecourse(@Param("courseid")String courseid, @Param("namecourse") String namecourse );

	@Modifying
	@Query("UPDATE Course course SET course.addedby = :addedby WHERE course.courseid = :courseid ")
	void updateaddedby(@Param("courseid")String courseid, @Param("addedby") String addedby );
	
	@Modifying
	@Query("UPDATE Course course SET course.nameinstittion = :nameinstittion WHERE course.courseid = :courseid ")
	void updatenameinstittion(@Param("courseid")String courseid, @Param("nameinstittion") String nameinstittion );
	
	@Modifying
	@Query("UPDATE Course course SET course.courseattch = :courseattch WHERE course.courseid = :courseid ")
	void updatecourseattch(@Param("courseid")String courseid, @Param("courseattch") String courseattch );
	
	@Modifying
	@Query("UPDATE Course course SET course.startdate = :startdate WHERE course.courseid = :courseid ")
	void updatestartdate(@Param("courseid")String courseid, @Param("startdate") String startdate );
	
	@Modifying
	@Query("UPDATE Course course SET course.enddate = :enddate WHERE course.courseid = :courseid ")
	void updateenddate(@Param("courseid")String courseid, @Param("enddate") String enddate );
}

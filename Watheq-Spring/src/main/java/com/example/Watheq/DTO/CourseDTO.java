package com.example.Watheq.DTO;

import java.sql.Timestamp;

import com.example.Watheq.model.Company;
import com.example.Watheq.model.EduInstitution;
import com.example.Watheq.model.Individual;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class CourseDTO {

	private String courseid;
	private Individual nationalid; 
	private EduInstitution eduid; 
	private Company cr ; 
	private String namecourse;
	private String addedby;
	private String nameinstittion;
	private String coursesttch;
	private Timestamp startdate;
	private Timestamp enddate;
	public String getCourseid() {
		return courseid;
	}
	public CourseDTO() {
		super();
	}
	public CourseDTO(String courseid, Individual nationalid, EduInstitution eduid, Company cr, String namecourse,
			String addedby, String nameinstittion, String coursesttch, Timestamp startdate, Timestamp enddate) {
		super();
		this.courseid = courseid;
		this.nationalid = nationalid;
		this.eduid = eduid;
		this.cr = cr;
		this.namecourse = namecourse;
		this.addedby = addedby;
		this.nameinstittion = nameinstittion;
		this.coursesttch = coursesttch;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	
	
	
	

}

package com.example.Watheq.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Course")
public class Course implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	//user_id
	@Id
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "courseid",nullable = false)
	private String courseid;

	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name=" nationalid",nullable=false)
	private Individual nationalid; 


	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="eduid",nullable=false)
	private EduInstitution eduid; 


	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="cr",nullable=false)
	private Company cr ; 

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "namecourse",nullable = false)
	private String namecourse;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "addedby",nullable = false)
	private String addedby;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "nameinstittion",nullable = false)
	private String nameinstittion;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "courseattch",nullable = false)
	private String courseattch;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "startdate",nullable = false)
	private Timestamp startdate;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "enddate",nullable = false)
	private Timestamp enddate;



	public Course() {
	}
	

	@Builder
	public Course(String courseid, Individual nationalid, EduInstitution eduid, Company cr, String namecourse,
			String addedby, String nameinstittion, String courseattch, Timestamp startdate, Timestamp enddate) {
		super();
		this.courseid = courseid;
		this.nationalid = nationalid;
		this.eduid = eduid;
		this.cr = cr;
		this.namecourse = namecourse;
		this.addedby = addedby;
		this.nameinstittion = nameinstittion;
		this.courseattch = courseattch;
		this.startdate = startdate;
		this.enddate = enddate;
	}



	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", nationalid=" + nationalid + ", eduid=" + eduid + ", cr=" + cr
				+ ", namecourse=" + namecourse + ", addedby=" + addedby + ", nameinstittion=" + nameinstittion
				+ ", courseattch=" + courseattch + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}

}

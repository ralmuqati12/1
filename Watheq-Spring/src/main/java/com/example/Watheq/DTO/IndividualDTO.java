package com.example.Watheq.DTO;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IndividualDTO extends WatheqUserDTO {

	private String nationalid;
	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;
	private String status;
	private String skills;
	private Date dob;
	private String major;
	private String attachments;
	private String jop;
	
	public IndividualDTO() {
		super();
	}
	public IndividualDTO(String email, String phoneNumber, String address, String password, String nationalid,
			String firstname, String middlename, String lastname, String gender, String status, String skills,
			Date dob, String major, String attachments, String jop) {
		super(email, phoneNumber, address, password);
		this.nationalid = nationalid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.status = status;
		this.skills = skills;
		this.dob = dob;
		this.major = major;
		this.attachments = attachments;
		this.jop = jop;
	}
	
	
	
	
	


}

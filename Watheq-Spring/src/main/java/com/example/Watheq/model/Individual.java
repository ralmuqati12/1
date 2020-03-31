package com.example.Watheq.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Individual")
public class Individual extends WatheqUser implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	// @Id
	// @GeneratedValue(generator="system-uuid")
	// @GenericGenerator(name="system-uuid", strategy = "uuid")

	@Id
	@NotNull(message = " Cannot be Empty ")
	// @Size(min=10, max=10)
	@Column(name = "nationalid",nullable=false, unique=true)
	private String nationalid;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "firstname",nullable = false)
	private String firstname;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "middlename",nullable = false)
	private String middlename;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "lastname",nullable = false)
	private String lastname;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "gender",nullable = false)
	private String gender;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "status")
	private String status;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "skills")
	private String skills;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "dob",nullable = false)
	private Date dob;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "major",nullable = false)
	private String major;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "attachments")
	private String attachments;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "jop")
	private String jop;

	public  Individual() {
	} 

	

	public Individual( String nationalid) {
		super();
		this.nationalid = nationalid;
	}



	@Builder
	public Individual(String email, String phonenumber, String address, String password, String nationalid,
			String firstname, String middlename, String lastname, String gender, String status, String skills,
			Date dob, String major, String attachments, String jop) {
		super(email, phonenumber, address, password);
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

	@Override
	public String toString() {
		return "Individual [nationalid=" + nationalid + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", gender=" + gender + ", status=" + status + ", skills=" + skills + ", dob="
				+ dob + ", major=" + major + ", attachments=" + attachments + ", jop=" + jop + "]";
	}

}





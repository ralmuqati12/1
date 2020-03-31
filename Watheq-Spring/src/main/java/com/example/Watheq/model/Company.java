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
@Table(name = "Company")
public class Company extends WatheqUser implements Serializable  {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "cr", unique=true)
	private String cr;
	// Name of company
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "companyname",nullable = false)
	private String companyname;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "startdate",nullable = false)
	private Date startdate;
	// cr ending date
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "enddate",nullable = false)
	private Date enddate;

	public Company() {
	}
	
	
	

	@Builder
	public Company(String email, String phonenumber, String address, String password, String cr, String companyname,
			Date startdate, Date enddate) {
		super(email, phonenumber, address, password);
		this.cr = cr;
		this.companyname = companyname;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	@Override
	public String toString() {
		return "Company [cr=" + cr + ", companyname=" + companyname + ", startdate=" + startdate + ", enddate="
				+ enddate + "]";
	}
}


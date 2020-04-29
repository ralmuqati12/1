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




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cr == null) ? 0 : cr.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (cr == null) {
			if (other.cr != null)
				return false;
		} else if (!cr.equals(other.cr))
			return false;
		return true;
	}




	public boolean remove(Company company) {
		// TODO Auto-generated method stub
		return false;
	}
}


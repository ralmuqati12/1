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
@Table(name = "Experience")
public class Experience implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "expid",nullable = false)
	private String expid;

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
	@Column(name = "exposition",nullable = false)
	private String exposition;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "namecompany",nullable = false)
	private String namecompany;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "startdate",nullable = false)
	private Timestamp startdate;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "enddate",nullable = false)
	private Timestamp enddate;
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "addby",nullable = false)
	private String addby;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "refname",nullable = false)
	private String refname;
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "refemail",nullable = false, unique=true)
	private String refemail;


	public Experience() {
		super();
	}
	@Builder
	public Experience(String expid, Individual nationalid, EduInstitution eduid, Company cr, String exposition,
			String namecompany, Timestamp startdate, Timestamp enddate, String addby, String refname, String refemail) {
		super();
		this.expid = expid;
		this.nationalid = nationalid;
		this.eduid = eduid;
		this.cr = cr;
		this.exposition = exposition;
		this.namecompany = namecompany;
		this.startdate = startdate;
		this.enddate = enddate;
		this.addby = addby;
		this.refname = refname;
		this.refemail = refemail;
	}
	@Override
	public String toString() {
		return "Experience [expid=" + expid + ", nationalid=" + nationalid + ", eduid=" + eduid + ", cr=" + cr
				+ ", exposition=" + exposition + ", namecompany=" + namecompany + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", addby=" + addby + ", refname=" + refname + ", refemail=" + refemail + "]";
	}


}


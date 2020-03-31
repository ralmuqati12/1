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
@Table(name = "language")
public class Language implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = " Cannot be Empty ")
	private String langugeid;

	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name=" nationalid",nullable=false)
	private Individual nationalid; 

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "langugename",nullable = false)
	private String langugename;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "langugedate",nullable = false)
	private Timestamp langugedate;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "langugerefrenceno",nullable = false)
	private long langugerefrenceno;


	//   @Column(name = "duration_valid")
	//  private String duration_valid;
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "langugeattach",nullable = false)
	private String langugeattach;

	public  Language() {
	}

	
	@Builder
	public Language(String langugeid, Individual nationalid, String langugename, Timestamp langugedate,
			long langugerefrenceno, String langugeattach) {
		super();
		this.langugeid = langugeid;
		this.nationalid = nationalid;
		this.langugename = langugename;
		this.langugedate = langugedate;
		this.langugerefrenceno = langugerefrenceno;
		this.langugeattach = langugeattach;
	}

	@Override
	public String toString() {
		return "Language [langugeid=" + langugeid + ", nationalid=" + nationalid + ", langugename=" + langugename
				+ ", langugedate=" + langugedate + ", langugerefrenceno=" + langugerefrenceno + ", langugeattach="
				+ langugeattach + "]";
	}



}



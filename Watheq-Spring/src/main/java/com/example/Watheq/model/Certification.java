package com.example.Watheq.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.CascadeType;
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
@Table(name = "Certification")
public class Certification  implements Serializable {


	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "cer_id",nullable=false)
	private String cer_id;

	@ManyToOne(fetch=FetchType.LAZY,optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="nationalid",nullable=false, unique=true)
	private Individual nationalid; 

	@ManyToOne(fetch=FetchType.LAZY,optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="eduid",nullable=false, unique=true)
	private EduInstitution eduid; 

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "uni_name",nullable = false)
	private String uni_name;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "addby",nullable = false)
	private String addby;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "certdate",nullable = false)
	private Timestamp certdate;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "gba",nullable = false)
	private double gba ;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "degree",nullable = false)
	private String degree;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "major",nullable = false)
	private String major;

	@NotNull(message = " Cannot be Empty ")
	@Column(name = "cerattach",nullable = false)
	private String cerattach;

	public Certification() {
	}


	@Builder
	public Certification(String cer_id, String nationalid, String eduid, String uni_name, String addby,
			Timestamp certdate, double gba, String degree, String major, String cerattach) {
		this.cer_id = cer_id;
		this.nationalid = new Individual (nationalid);
		this.eduid = new EduInstitution (eduid);
		this.uni_name = uni_name;
		this.addby = addby;
		this.certdate = certdate;
		this.gba = gba;
		this.degree = degree;
		this.major = major;
		this.cerattach = cerattach;
	}


	@Override
	public String toString() {
		return "Certification [cer_id=" + cer_id + ", nationalid=" + nationalid + ", eduid=" + eduid + ", uni_name="
				+ uni_name + ", addby=" + addby + ", certdate=" + certdate + ", gba=" + gba + ", degree=" + degree
				+ ", major=" + major + ", cerattach=" + cerattach + "]";
	}



}

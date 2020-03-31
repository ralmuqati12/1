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
@Table(name = "Recommendation")
public class Recommendation  implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	//Recommendation ID
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = " Cannot be Empty ")
	private String recoid;

	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name=" nationalid",nullable=false)
	private Individual nationalid; 


	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="eduid",nullable=false)
	private EduInstitution eduid; 


	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="cr",nullable=false)
	private Company cr ; 

	//Person who write it
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "recofrom",nullable = false)
	private String recofrom;

	//Recommendation Creation date
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "recodate",nullable = false)
	private Timestamp recodate;

	//User Who added Recommendation 
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "recoaddby",nullable = false)
	private String recoaddby;

	//URL Recommendation attachment
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "recoattach",nullable = false)
	private String recoattach;

	//The name of the institute Who added Recommendation 
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "recoinstitutename",nullable = false)
	private String recoinstitutename;


	public Recommendation() {
	}
	
	@Builder
	public Recommendation(String recoid, Individual nationalid, EduInstitution eduid, Company cr, String recofrom,
			Timestamp recodate, String recoaddby, String recoattach, String recoinstitutename) {
		super();
		this.recoid = recoid;
		this.nationalid = nationalid;
		this.eduid = eduid;
		this.cr = cr;
		this.recofrom = recofrom;
		this.recodate = recodate;
		this.recoaddby = recoaddby;
		this.recoattach = recoattach;
		this.recoinstitutename = recoinstitutename;
	}


	@Override
	public String toString() {
		return "Recommendation [recoid=" + recoid + ", nationalid=" + nationalid + ", eduid=" + eduid + ", cr=" + cr
				+ ", recofrom=" + recofrom + ", recodate=" + recodate + ", recoaddby=" + recoaddby + ", recoattach="
				+ recoattach + ", recoinstitutename=" + recoinstitutename + "]";
	}





}

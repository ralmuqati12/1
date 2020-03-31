package com.example.Watheq.DTO;


import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CertificationDTO {

	private String cer_id;
	private String nationalid; 
	private String eduid; 
    private String uni_name;
	private String addby;
	private Timestamp certdate;
	private double gba ;
	private String degree;
	private String major;
	private String cerattach;


	public CertificationDTO() {
	}

	public CertificationDTO(String cer_id, String nationalid, String eduid, String uni_name, String addby,
			Timestamp certdate, double gba, String degree, String major, String cerattach) {
		this.cer_id = cer_id;
		this.nationalid = nationalid;
		this.eduid = eduid;
		this.uni_name = uni_name;
		this.addby = addby;
		this.certdate = certdate;
		this.gba = gba;
		this.degree = degree;
		this.major = major;
		this.cerattach = cerattach;
	}
	
}


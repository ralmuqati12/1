package com.example.Watheq.DTO;

import java.sql.Timestamp;
import com.example.Watheq.model.Company;
import com.example.Watheq.model.EduInstitution;
import com.example.Watheq.model.Individual;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RecommendationDTO {

	private String recoid;
	private Individual nationalid; 
	private EduInstitution eduid; 
	private Company cr ; 
	private String recofrom;
	private Timestamp recodate;
	private String recoaddby;
	private String recoattach;
	private String recoinstitutename;
	
	public RecommendationDTO() {
		super();
	}
	public RecommendationDTO(String recoid, Individual nationalid, EduInstitution eduid, Company cr, String recofrom,
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
	
	


}

package com.example.Watheq.DTO;

import java.sql.Timestamp;
import com.example.Watheq.model.Company;
import com.example.Watheq.model.EduInstitution;
import com.example.Watheq.model.Individual;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExperienceDTO {

	private String expid;
	private Individual nationalid; 
	private EduInstitution eduid; 
	private Company cr; 
	private String exposition;
	private String namecompany;
	private Timestamp startdate;
	private Timestamp enddate;
	private String addby;
	private String refname;
	private String refemail;
	public String getExpid() {
		return expid;
	}
	public ExperienceDTO() {
		super();
	}
	public ExperienceDTO(String expid, Individual nationalid, EduInstitution eduid, Company cr, String exposition,
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

	
}

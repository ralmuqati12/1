package com.example.Watheq.DTO;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LanguageDTO {

	private String langugeid;
	private String nationalid;  
	private String langugename;
	private Timestamp langugedate;
	private long langugerefrenceno;
	private String langugeattach;
	
	public String getLangugeid() {
		return langugeid;
	}
	public LanguageDTO() {
		super();
	}
	public LanguageDTO(String langugeid, String nationalid, String langugename, Timestamp langugedate,
			long langugerefrenceno, String langugeattach) {
		super();
		this.langugeid = langugeid;
		this.nationalid = nationalid;
		this.langugename = langugename;
		this.langugedate = langugedate;
		this.langugerefrenceno = langugerefrenceno;
		this.langugeattach = langugeattach;
	}

	
	
	
}

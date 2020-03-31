package com.example.Watheq.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EduInstitutionDTO extends WatheqUserDTO {
	private String eduid;
	private String eduname;
	public String getEduid() {
		return eduid;
	}

	public EduInstitutionDTO() {
		super();
	}
	public EduInstitutionDTO(String email, String phonenumber, String address, String password, String eduid,
			String eduname) {
		super(email, phonenumber, address, password);
		this.eduid = eduid;
		this.eduname = eduname;
	}
	

}

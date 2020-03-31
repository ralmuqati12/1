package com.example.Watheq.DTO;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompanyDTO extends WatheqUserDTO {

	private String cr;
	private String companyname;
    private Date startdate;
	private Date enddate;

	public CompanyDTO() {
		super();
	}
	public CompanyDTO(String email, String phoneNumber, String address, String password, String cr, String companyname,
			Date startdate, Date enddate) {
		super(email, phoneNumber, address, password);
		this.cr = cr;
		this.companyname = companyname;
		this.startdate = startdate;
		this.enddate = enddate;
	}

}

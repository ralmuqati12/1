package com.example.Watheq.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WatheqUserDTO {

	private String email;
	private String phonenumber;
	private String address;
	private String password;

	public WatheqUserDTO() {
		super();
	}
	public WatheqUserDTO( String email, String phonenumber, String address, String password) {
		super();
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
	}
	
	


}

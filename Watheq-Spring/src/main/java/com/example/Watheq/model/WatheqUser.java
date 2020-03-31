package com.example.Watheq.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class WatheqUser implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;


	@Email(message = "email should be a valid email")
	@NotNull(message = " Cannot be Empty ")
	@Column(name = "email", nullable = false, unique=true)
	private String email;

    @NotNull(message = " Cannot be Empty")
	@Pattern(regexp = "(\\+966|0)[0-9]{9}")
	@Column(name = "phonenumber",nullable = false, unique=true)
	private String phonenumber;

    @NotNull(message = " Cannot be Empty")
	@Column(name = "address",nullable = false)
	private String address;

	@NotNull(message = " Cannot be Empty")
	@Column(name = "password",nullable = false, unique=true)
	private String password;

	public WatheqUser() {
		super();

	}
	public WatheqUser(String email, String phonenumber, String address, String password) {
		super();
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WatheqUser [ email=" + email + ", phonenumber=" + phonenumber + ", address="
				+ address + ", password=" + password + "]";
	}

}



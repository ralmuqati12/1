package com.example.Watheq.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "EduInstitution")
public class EduInstitution extends WatheqUser implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	//@Size(min=10, max=10)
	//@NotNull(message = " Cannot be Empty ")
	@Column(name = "eduid",nullable = false, unique=true)
	private String eduid;

//	@NotNull(message = " Cannot be Empty ")
	@Column(name = "eduname",nullable = false, unique=true)
	private String eduname;




	public EduInstitution(String eduid) {
	super();
	this.eduid = eduid;
}




	@Builder
	public EduInstitution(String email, String phonenumber, String address, String password, String eduid,
			String eduname) {
		super(email, phonenumber, address, password);
		this.eduid = eduid;
		this.eduname = eduname;
	}




	@Override
	public String toString() {
		return "EduInstitution [eduid=" + eduid + ", eduname=" + eduname + "]";
	}




	public EduInstitution() {
		super();
	}




}


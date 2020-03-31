package com.example.Watheq.ExceptionHandling;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionDetails {

	private String message;
	private String url;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date timestamp;
	
	public ExceptionDetails() {
	    this.timestamp = new Date();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	public ExceptionDetails(String message, String url) {
		this();
		this.message = message;
		this.url = url;
	}

	
}


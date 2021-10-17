package com.project.util;

public class MyMessage {

	private String emailId;
	private String message;
	
	public MyMessage() {
		super();
	}
	
	public MyMessage(String emailId,String message) {
		this.emailId=emailId;
		this.message=message;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}

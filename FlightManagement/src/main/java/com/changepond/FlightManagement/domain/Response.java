package com.changepond.FlightManagement.domain;

import java.io.Serializable;

public class Response implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -4228414060104273715L;
private String message;



public Response(String message) {
	super();
	this.message=message;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}

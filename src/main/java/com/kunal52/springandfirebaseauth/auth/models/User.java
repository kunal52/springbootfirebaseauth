package com.kunal52.springandfirebaseauth.auth.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408418647685225829L;
	private String uid;
	private String name;
	private String email;
	private boolean isEmailVerified;
	private String issuer;
	private String picture;

}

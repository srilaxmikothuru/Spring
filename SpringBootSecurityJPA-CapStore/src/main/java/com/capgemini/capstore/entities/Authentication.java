package com.capgemini.capstore.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Authentication")
public class Authentication {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authId;	
	private String mobileNo;
	private String password;
	private String userAccess;
	private int verfication;

	@Override
	public String toString() {
		return "Authentication [authId=" + authId + ", mobileNo=" + mobileNo + ", password=" + password
				+ ", userAccess=" + userAccess + ", verfication=" + verfication + "]";
	}
	//Constructor
	public Authentication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authentication(String mobileNo, String password, String userAccess, int verfication) {
		super();
		this.mobileNo = mobileNo;
		this.password = password;
		this.userAccess = userAccess;
		this.verfication = verfication;
	}

	//Getters and Setters
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserAccess() {
		return userAccess;
	}
	public void setUserAccess(String userAccess) {
		this.userAccess = userAccess;
	}
	public int getVerfication() {
		return verfication;
	}
	public void setVerfication(int verfication) {
		this.verfication = verfication;
	}

	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}


}

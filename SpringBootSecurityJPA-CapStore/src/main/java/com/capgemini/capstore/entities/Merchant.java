package com.capgemini.capstore.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Merchant")
public class Merchant implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchantId;
	private String merhantName;
	private String merchantEmail;
	private String mobileNo;
	
	

	//Constructors
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Merchant(int merchantId) {
		super();
		this.merchantId = merchantId;
	}

	public Merchant(int merchantId, String merhantName, String merchantEmail, String mobileNo) {
		super();
		this.merchantId = merchantId;
		this.merhantName = merhantName;
		this.merchantEmail = merchantEmail;
		this.mobileNo = mobileNo;
		
	}

	//Getters and Setters
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerhantName() {
		return merhantName;
	}
	public void setMerhantName(String merhantName) {
		this.merhantName = merhantName;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}

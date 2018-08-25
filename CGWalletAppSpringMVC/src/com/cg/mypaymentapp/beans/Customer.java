
//Customer class bean

package com.cg.mypaymentapp.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer1")
public class Customer implements Serializable
{
	private static final long serialVersionUID = 1L;
@NotEmpty
	private String name;
	@Id
	@NotEmpty
	@Pattern(regexp="[1-9][0-9]{9}")
	private String mobileNo;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="wallet")
	private Wallet wallet;
	public Customer(String name2, String mobileNo2, Wallet wallet2) {
		this.name=name2;
		mobileNo=mobileNo2;
		wallet=wallet2;
}
	
	//Getters and setters
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getMobileNo()
	{
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) 
	{
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() 
	{
		return wallet;
	}
	
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public String toString() 
	{
		return "Customer name=" + name + ", mobileNo=" + mobileNo
				 + wallet;
	}
	
	//Hash code and equals method for phone number
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		return true;
	}
	public Customer() 
	{
		super();
		
	}
	
	
	
	
}



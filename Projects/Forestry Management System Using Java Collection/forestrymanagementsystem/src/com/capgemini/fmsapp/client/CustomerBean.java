package com.capgemini.fmsapp.client;

import java.io.Serializable;

public class CustomerBean implements Serializable {
	
	private int custid;
    private String telno;
    private String cname;
    private String town;
    private String postcode;
    private String email;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Customer Information [custid=" + custid + ", Mob-no=" + telno + ", Name=" + cname + ", town=" + town
				+ ", postcode=" + postcode + ", email=" + email + "]";
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + custid;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((postcode == null) ? 0 : postcode.hashCode());
		result = prime * result + ((telno == null) ? 0 : telno.hashCode());
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerBean other = (CustomerBean) obj;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (custid != other.custid)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (telno == null) {
			if (other.telno != null)
				return false;
		} else if (!telno.equals(other.telno))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		return true;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

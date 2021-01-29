package com.jayanthi.web.model;

public class employeeinfo {

	private int user_id;
	private String fname;
	private String lname;
	private String address;
	private String contact;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
		
	}
	@Override
	public String toString() {
		return "employeeinfo [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", contact=" + contact + "]";
	}
	
	
}

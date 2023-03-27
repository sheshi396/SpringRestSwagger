package com.Spring.request;


public class Passenger {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String date;
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
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", date=" + date
				+ "]";
	}
	

}

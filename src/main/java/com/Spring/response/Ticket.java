package com.Spring.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
	
	private Integer ticketid;
	private String from;
	private String to;
	private String price;
	private String status;
	
	
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", from=" + from + ", to=" + to + ", price=" + price + ", status="
				+ status + "]";
	}
	
	

}

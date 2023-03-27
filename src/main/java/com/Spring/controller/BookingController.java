package com.Spring.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.request.Passenger;
import com.Spring.response.Ticket;

@RestController
public class BookingController 
{
	
	private Map<Integer,Ticket> tickets = new HashMap<>();
	
	@PostMapping(value="/ticket",
			consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"}
	
			)
	public Ticket bookTicket(@RequestBody Passenger passenger) {
		
		// logic to book Ticket
		
	    Ticket t = new Ticket();
	    
	    Random r= new Random();
	    int ticketId =  r.nextInt();
	    t.setTicketid(ticketId);
	    t.setFrom(passenger.getFrom());
	    t.setTo(passenger.getTo());
	    t.setPrice("1500.00INR");
	    t.setStatus("Confirmed");
	    
	    tickets.put(ticketId, t);
	    
		return t;
	}
    @GetMapping(
    	value="/ticket/{ticketId}",
    	produces= {"application/xml","application/json"}
    		
    		)
	public Ticket getTicket(@PathVariable Integer ticketId) {
		if (tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		
		return null;
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

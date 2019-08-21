package com.techelevator.tickets;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ticket {

	private BigDecimal price;
	private String ticketType;
	
	public Ticket(double price) {
		this(price, "Regular");
	}
	public Ticket(double price, String ticketType) {
		this.setPrice(new BigDecimal(price));
		this.ticketType = ticketType;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public BigDecimal getFee() {
		return price.multiply(new BigDecimal(.20));
	}
	
	public BigDecimal getTotalPrice() {
		BigDecimal totalCost = price.add(getFee());
		totalCost = totalCost.setScale(2, RoundingMode.HALF_UP);
		return totalCost;
	}
	
}

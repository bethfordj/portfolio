package com.techelevator.tickets;

import java.util.ArrayList;
import java.util.List;

public class TicketDemo {

	public static void main(String[] args) {
		
		Ticket ticketOne = new Ticket(12.00);
		System.out.println("Ticket One: " + ticketOne.getTotalPrice());
		
		WillCallTicket ticketTwo = new WillCallTicket(15.00, "John");
		System.out.println("Ticket Two: " + ticketTwo.getTotalPrice());

		Under21Ticket ticketThree = new Under21Ticket(15.00, 3.00);
		System.out.println("Ticket Three: " + ticketThree.getTotalPrice());
		
		Ticket willCallAsTicket = ticketTwo;
		WillCallTicket backToWillCallTicket = null;
		if (willCallAsTicket instanceof WillCallTicket) {
			backToWillCallTicket = (WillCallTicket) willCallAsTicket;
		}
		
		System.out.println(backToWillCallTicket.getTicketHolderName());
		
		List<Ticket> tickets = new ArrayList<Ticket>();
		tickets.add(ticketOne);
		tickets.add(ticketTwo);
		tickets.add(ticketThree);
		
		for (Ticket t : tickets) {
			System.out.println("Ticket cost is " + t.getTicketType() + " "+ t.getTotalPrice());
		}
		
	}

}

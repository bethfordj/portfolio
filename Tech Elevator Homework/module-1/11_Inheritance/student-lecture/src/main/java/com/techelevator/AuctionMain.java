package com.techelevator;

import java.util.Scanner;

public class AuctionMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Auction auction = new Auction("Record");
		
		System.out.println("Buy my " + auction.getItemForSale());
		
		while (true) {
			System.out.print("Enter your name >>>");
			String bidder = in.nextLine();
			
			System.out.print("Place a bid >>>");
			String amount = in.nextLine();
			
			int bid = Integer.parseInt(amount);
			
			boolean isWinning = auction.placeBid(new Bid(bidder, bid));
			
			if (auction.getHighBid().getBidAmount() > 0) {
				System.out.println(auction.getHighBid().getBidder() + " is winning with a bid of " + auction.getHighBid().getBidAmount());
			} else {
				System.out.println("No winning bid");
			}
		}
		
	}

}

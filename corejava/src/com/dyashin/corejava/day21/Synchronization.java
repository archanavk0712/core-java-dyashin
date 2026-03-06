package com.dyashin.corejava.day21;

class Ticket{
	
	int seat=1;
	
	public synchronized void booking(String customerName) {
		if(seat>0) {
			System.out.println(customerName+" : successfully booked the ticket");
			seat--;
		}else {
			System.out.println(customerName+" : Unable to book the ticket");
		}
	}
}

class BookingTicket extends Thread{
	
	Ticket booking;
	String customerName;
	
	BookingTicket(Ticket booking, String customerName) {

		this.booking=booking;
		this.customerName=customerName;
	}
	
	public void run() {
		booking.booking(customerName);
	}
}
public class Synchronization {

	public static void main(String[] args) {

		Ticket t =new Ticket();
		BookingTicket bt = new BookingTicket(t, "Archana");
		BookingTicket bt2 = new BookingTicket(t, "Moulya");
		bt.start();
		bt2.start();
	}

}

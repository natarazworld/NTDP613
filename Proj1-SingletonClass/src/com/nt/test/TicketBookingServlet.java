//TicketBookingServlet.java
package com.nt.test;

import com.nt.sdp.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p1=Printer.getInstance();
		System.out.println(p1.hashCode());
	}
}

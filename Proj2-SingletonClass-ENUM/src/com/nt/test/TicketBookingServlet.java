//TicketBookingServlet.java
package com.nt.test;

import com.nt.sdp.Printer1;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer1 p1=Printer1.getInstance();
		System.out.println(p1.hashCode());
	}
}

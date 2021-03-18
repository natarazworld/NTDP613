//TicketBookingServlet.java
package com.nt.test2;

import com.nt.sdp.Printer2;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer2 p1=Printer2.getInstance();
		System.out.println(p1.hashCode());
	}
}

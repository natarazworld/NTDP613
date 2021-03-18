//TicketBookingServlet.java
package com.nt.test3;

import com.nt.sdp.Printer3;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer3 p1=Printer3.getInstance();
		System.out.println(p1.hashCode());
	}
}

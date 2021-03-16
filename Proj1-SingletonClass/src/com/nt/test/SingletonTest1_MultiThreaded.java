//SingletonTest1_MultiThreaded .java
package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest1_MultiThreaded {

	public static void main(String[] args) {
		  //create threads having  Servlet class obj as  data
		   TicketBookingServlet servlet=new TicketBookingServlet();
		   Thread t1=new Thread(servlet);
		   Thread t2=new Thread(servlet);
		   Thread t3=new Thread(servlet);
		   t1.start();
		   t2.start();
		   t3.start();
		
		}//main
}//class

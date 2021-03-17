//SingtonTest.java
package com.nt.test;

import com.nt.sdp.Printer1;

public class SingletonTest1 {

	public static void main(String[] args) throws Exception {
		//Class.forName("com.nt.sdp.Printer");
		
			Printer1 p1=Printer1.getInstance();
			Printer1 p2=Printer1.getInstance();
			
			System.out.println(p1.hashCode()+ "   "+p2.hashCode());
			System.out.println("p1==p2?"+(p1==p2));
		
		}//main
}//class

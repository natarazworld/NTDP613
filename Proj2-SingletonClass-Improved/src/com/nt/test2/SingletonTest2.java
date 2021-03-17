//SingtonTest2.java
package com.nt.test2;

import com.nt.sdp.Printer2;

public class SingletonTest2 {

	public static void main(String[] args) throws Exception {
		
			Printer2 p1=Printer2.getInstance();
			Printer2 p2=Printer2.getInstance();
			
			System.out.println(p1.hashCode()+ "   "+p2.hashCode());
			System.out.println("p1==p2?"+(p1==p2));
		
		}//main
}//class

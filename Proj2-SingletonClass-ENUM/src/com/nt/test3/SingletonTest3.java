//SingtonTest3.java
package com.nt.test3;

import com.nt.sdp.Printer3;

public class SingletonTest3 {

	public static void main(String[] args) throws Exception {
		
			Printer3 p1=Printer3.getInstance();
			Printer3 p2=Printer3.getInstance();
			
			System.out.println(p1.hashCode()+ "   "+p2.hashCode());
			System.out.println("p1==p2?"+(p1==p2));
		
		}//main
}//class

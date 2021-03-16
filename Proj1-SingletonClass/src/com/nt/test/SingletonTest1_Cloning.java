//SingletonTest1_Cloning.java
package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest1_Cloning {

	public static void main(String[] args) {
		//get Singleton java class object
		Printer p1=Printer.getInstance();
		//do cloning on object
		try {
			Printer p2=(Printer)p1.clone();
			System.out.println("Cloned object is created");
			System.out.println(p1.hashCode()+"  "+p2.hashCode());
			System.out.println("p1==p2?"+(p1==p2));
		}
		catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

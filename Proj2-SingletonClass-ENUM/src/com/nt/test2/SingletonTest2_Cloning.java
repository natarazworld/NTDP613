//SingletonTest2_Cloning.java
package com.nt.test2;

import com.nt.sdp.Printer2;

public class SingletonTest2_Cloning {

	public static void main(String[] args) {
		//get Singleton java class object
		Printer2 p1=Printer2.getInstance();
		//do cloning on object
		try {
			Printer2 p2=(Printer2)p1.clone();
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

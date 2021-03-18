//SingletonTest3_Cloning.java
package com.nt.test3;

import com.nt.sdp.Printer3;

public class SingletonTest3_Cloning {
	public static void main(String[] args) {
		//get Singleton java class object
		Printer3 p1=Printer3.getInstance();
		//do cloning on object   ( Cloning is not possble on Enums)
/*		try {
			Printer3 p2=(Printer3)p1.clone();  //cloning not possible on  Enums
			System.out.println("Cloned object is created");
			System.out.println(p1.hashCode()+"  "+p2.hashCode());
			System.out.println("p1==p2?"+(p1==p2));
		}
		catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		} */

	}

}

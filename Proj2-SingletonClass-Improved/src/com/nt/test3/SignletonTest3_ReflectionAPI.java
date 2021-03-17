//SignletonTest3_ReflectionAPI.java
package com.nt.test3;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer2;
import com.nt.sdp.Printer3;

public class SignletonTest3_ReflectionAPI {

	public static void main(String[] args) {
		//get single object of single java class using static factory method
		Printer3 p1=Printer3.getInstance();
		System.out.println(p1.hashCode());
		try {
			//get java.lang.Class object representing Printer class
			Class c=p1.getClass();  //getClass() is public method of java.lang.Object class.
			//get All costructor of Printer class
			  Constructor cons[]= c.getDeclaredConstructors();
			  cons[0].setAccessible(true); //gives access to private cosntructor
			  ///create object using the accessed private constructor
			  Printer3 p2=(Printer3)cons[0].newInstance();
			  Printer3 p3=(Printer3)cons[0].newInstance();
			  System.out.println("Objects are created using reflection api");
			  System.out.println(p1.hashCode()+" "+p2.hashCode()+"  "+p3.hashCode());
		}//try
		catch(InstantiationException iae) {
			iae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}//main
}//class

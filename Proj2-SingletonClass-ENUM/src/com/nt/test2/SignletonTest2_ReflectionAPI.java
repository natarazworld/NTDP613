//SignletonTest2_ReflectionAPI.java
package com.nt.test2;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer1;
import com.nt.sdp.Printer2;

public class SignletonTest2_ReflectionAPI {

	public static void main(String[] args) {
		//get single object of single java class using static factory method
		Printer2 p1=Printer2.getInstance();
		System.out.println(p1.hashCode());
		try {
			//get java.lang.Class object representing Printer class
			Class c=p1.getClass();  //getClass() is public method of java.lang.Object class.
			//get All costructor of Printer class
			  Constructor cons[]= c.getDeclaredConstructors();
			  cons[0].setAccessible(true); //gives access to private cosntructor
			  ///create object using the accessed private constructor
			  Printer2 p2=(Printer2)cons[0].newInstance();
			  Printer2 p3=(Printer2)cons[0].newInstance();
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

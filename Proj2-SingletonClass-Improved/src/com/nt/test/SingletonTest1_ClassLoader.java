//SingtonTest.java
package com.nt.test;

import com.nt.sdp.Printer1;

public class SingletonTest1_ClassLoader {

	public static void main(String[] args) throws Exception {
			Printer1 p1=Printer1.getInstance();
			System.out.println(p1.hashCode());
			System.out.println("classLoader name::"+p1.getClass().getClassLoader());
			System.out.println("..............................................................");
			
				
		}//main
}//class

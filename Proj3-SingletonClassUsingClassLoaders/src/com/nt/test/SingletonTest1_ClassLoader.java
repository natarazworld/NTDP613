//SingtonTest.java
package com.nt.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.nt.sdp.Printer1;

public class SingletonTest1_ClassLoader {

	public static void main(String[] args) throws Exception {
		//get Firrst object using default classLoader  env..
			Printer1 p1=Printer1.getInstance();
			System.out.println(p1.hashCode());
			System.out.println("classLoader name::"+p1.getClass().getClassLoader());
			System.out.println("..............................................................");
			
			// creating second obect Singleton using CustomClassLoader (URLClassLoader)
			//URLClassLoader loader1=new URLClassLoader(new URL[] {new URL("file:/G:/Worskpaces/advjava/NTDP613/sdp1.jar") }, null);
			URLClassLoader loader1=new URLClassLoader(new URL[] {new URL("file:/G:/Worskpaces/advjava/NTDP613/sdp1.jar") }, p1.getClass().getClassLoader());
			//Load class using reflection api
			 Class<?> clazz1=loader1.loadClass("com.nt.sdp.Printer1");
			 //get access to getInstance() method
			 Method method=clazz1.getDeclaredMethod("getInstance",new Class[] {});
			 // invoke the method    (getInstance() is called)
			 Object o1=method.invoke(null);
			 System.out.println("class loader name::"+o1.getClass().getClassLoader());
			 System.out.println(p1.hashCode()+"  "+o1.hashCode());
			 
			
				
		}//main
}//class

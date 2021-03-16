//Printer.java
package com.nt.sdp;

import com.nt.commons.CommonsUtil;

public class Printer extends CommonsUtil {
	//private static volatile Printer INSTANCE;
	//private static Printer INSTANCE=new Printer();  //eager Instantiation.
	
	//private constructor
	private  Printer() {
		if(InnerPrinter.INSTANCE!=null)
			 throw new RuntimeException("object is already created!!!");
		
		System.out.println("Printer:: 0-param constructor");
	} //constructor
	
	/*	//static  factory method
		public synchronized static   Printer  getInstance() {
			 //singleton logic
			  if(INSTANCE==null)
				  INSTANCE=new Printer();
			  
			  return INSTANCE;
		}  //method 
	*/	
	
	/*//static  factory method
		public  static   Printer  getInstance() {
			 if(INSTANCE==null) { //1st NULL check	
				synchronized(Printer.class) {
				 //singleton logic
				  if(INSTANCE==null)  //2nd NULL check
					  INSTANCE=new Printer();
				}
			}
				  return INSTANCE;
			}  //method */
	
	private static class InnerPrinter{
		private static volatile Printer INSTANCE=new Printer();
	}
	//factory method
	public  static Printer getInstance() {
		return InnerPrinter.INSTANCE;
	}
	
	//To  Stop Cloning
	@Override
	public  Object clone()throws CloneNotSupportedException  {
		throw new CloneNotSupportedException("Cloning not allowed in Singleton Printer classs");
		//return InnerPrinter.INSTANCE;
	}
	
	//To Stop DeSerialization
	private static  final long serialVersionUID=5354353L;
	public  Object readResolve() {
		return InnerPrinter.INSTANCE;
		//throw  new  IllegalArgumentException("Derailziation is not allowed on singleton class");
	}
	
	/*	@Override
		public String toString() {
			return super.toString();
		}*/
	public String hello() {
		return "hello";
	}
	
	//b.method
	public  void  print(String msg) {
		System.out.println(msg);
	} //print(-)
	
}//class

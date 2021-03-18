//Printer2.java
package com.nt.sdp;

import com.nt.commons.CommonsUtil;

public class Printer2 extends CommonsUtil {
	//private constructor
	private  Printer2() {
		  if(InnerPrinter2.INSTANCE!=null) {
			  throw new RuntimeException("object is already created!!!");
		  }
		System.out.println("Printer:: 0-param constructor");
	} //constructor
	
	//nested   inner  class
	private static  class InnerPrinter2{
		private static volatile Printer2 INSTANCE=new Printer2();
	}
	
	//static  factory method
	public   static   Printer2  getInstance() {
		return   InnerPrinter2.INSTANCE;
	}
	
	//To  Stop Cloning
	@Override
	public  Object clone()throws CloneNotSupportedException  {
		throw new CloneNotSupportedException("Cloning not allowed in Singleton Printer classs");
		//return InnerPrinter2.INSTANCE;
	}
	
	//To Stop DeSerialization
	private static  final long serialVersionUID=5354353L;
	public  Object readResolve() {
		return InnerPrinter2.INSTANCE;
		//throw  new  IllegalArgumentException("Derailziation is not allowed on singleton class");
	}
	
	//b.method
	public  void  print(String msg) {
		System.out.println(msg);
	} //print(-)
	
}//class

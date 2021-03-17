//Printer1.java
package com.nt.sdp;

import com.nt.commons.CommonsUtil;

public class Printer1 extends CommonsUtil {
	private static volatile Printer1 INSTANCE;

	//private constructor
	private  Printer1() {
		  if(INSTANCE!=null) {
			  throw new RuntimeException("object is already created!!!");
		  }
		System.out.println("Printer:: 0-param constructor");
	} //constructor
	
	//static  factory method
		public  static   Printer1  getInstance() {
			 if(INSTANCE==null) { //1st NULL check	
				synchronized(Printer1.class) {
				 //singleton logic
				  if(INSTANCE==null)  //2nd NULL check
					  INSTANCE=new Printer1();
				}
			}
				  return INSTANCE;
		}  //method 
	
	//To  Stop Cloning
	@Override
	public  Object clone()throws CloneNotSupportedException  {
		throw new CloneNotSupportedException("Cloning not allowed in Singleton Printer classs");
		 //return INSTANCE; 
	}
	
	//To Stop DeSerialization
	private static  final long serialVersionUID=5354353L;
	public  Object readResolve() {
		return  INSTANCE;
		//throw  new  IllegalArgumentException("Derailziation is not allowed on singleton class");
	}
	
	//b.method
	public  void  print(String msg) {
		System.out.println(msg);
	} //print(-)
	
}//class

package com.nt.sdp;

public class Printer {
	private static Printer INSTANCE;
	
	//private constructor
	private  Printer() {
		System.out.println("Printer:: 0-param constructor");
	} //constructor
	
	//static  factory method
	public static   Printer  getInstance() {
		 //singleton logic
		  if(INSTANCE==null)
			  INSTANCE=new Printer();
		  
		  return INSTANCE;
	}  //method
	
	//b.method
	public  void  print(String msg) {
		System.out.println(msg);
	} //print(-)
	
}//class

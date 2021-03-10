//Priter.java
package com.nt.sdp;

public class Printer {
	private static Printer INSTANCE;
	//private static Printer INSTANCE=new Printer();  //eager Instantiation.
	
	//private constructor
	private  Printer() {
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
	
	//static  factory method
		public  static   Printer  getInstance() {
			 if(INSTANCE==null) { //1st NULL check	
				synchronized(Printer.class) {
				 //singleton logic
				  if(INSTANCE==null)  //2nd NULL check
					  INSTANCE=new Printer();
				}
			}
				  return INSTANCE;
			}  //method
	
	/*public  static Printer getInstance() {
		return INSTANCE;
	}*/
	
	//b.method
	public  void  print(String msg) {
		System.out.println(msg);
	} //print(-)
	
}//class

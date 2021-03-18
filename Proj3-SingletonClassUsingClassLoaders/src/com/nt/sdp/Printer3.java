package com.nt.sdp;

public enum Printer3 {
	  INSTANCE;  //internally it equal to pulblic static final INSTANCE=new Printer3();
	
	
	//static  factory method  (optional)
	public static  Printer3 getInstance() {
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	

}

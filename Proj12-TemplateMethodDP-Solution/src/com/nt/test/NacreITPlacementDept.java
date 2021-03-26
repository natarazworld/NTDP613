package com.nt.test;

import com.nt.comp.HireFresher;
import com.nt.comp.HireUIFresher;
import com.nt.factory.HireFresherFactory;

public class NacreITPlacementDept {

	public static void main(String[] args) {
	   	    	HireFresher javaFresher=HireFresherFactory.getInstance("java");
	   	    	boolean result=javaFresher.recruiteFresher();
	   	    	if(result)
	   	    		System.out.println("JAva Fresher is selected");
	   	    	else
	   	    		System.out.println("Java Fresher is not not selected");
	}

}

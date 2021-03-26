package com.nt.test;

import com.nt.comp.HireDotNetFresher;
import com.nt.comp.HireFresher;
import com.nt.comp.HireJavaFresher;

public class NareshITPlacementDept {

	public static void main(String[] args) {
	   HireFresher javaFresher=new HireJavaFresher();
	    boolean result=javaFresher.conductAptitudeTest();
	    if(result)
	    	result=javaFresher.conductGDTest();
	    if(result)
	    	 result=javaFresher.conductTechnicalTest();
	    if(result)
	    	  result=javaFresher.conductCodingTest();
	    if(result)
	    	 result=javaFresher.conductHRTest();
	    if(result)
	    	System.out.println("Java Fresher is seleced");
	    else
	    	System.out.println("Java Fresher is not seleced");
	    	

	}

}

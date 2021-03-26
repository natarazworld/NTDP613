package com.nt.factory;

import com.nt.comp.HireDotNetFresher;
import com.nt.comp.HireFresher;
import com.nt.comp.HireJavaFresher;
import com.nt.comp.HireUIFresher;

public class HireFresherFactory {
	
  public static  HireFresher getInstance(String fresherType) {
	  if(fresherType.equalsIgnoreCase("java")) 
		  return new HireJavaFresher();
	  else if(fresherType.equalsIgnoreCase("dotNet"))
		  return  new HireDotNetFresher();
	  else if(fresherType.equalsIgnoreCase("ui"))
		  return new HireUIFresher();
	  else
		   throw new IllegalArgumentException("As of now we not recruiting  "+ fresherType+"  freshers");
  }
}

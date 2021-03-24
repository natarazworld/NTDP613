//BajajNoidaFactory.java
package com.nt.factory;

import com.nt.comp.BajajBike;
import com.nt.comp.BajajDiscover;
import com.nt.comp.BajajPlatina;
import com.nt.comp.BajajPulsor;

public class BajajNoidaFactory  extends BajajBikeFactory {

	 public   void  paint() {
		 System.out.println("Painting Bajaj Bike");
	 }
	 public  void  assemble() {
		 System.out.println("Assembling Bajaj Bike");
	 }

		public  void roadTest() {
			 System.out.println("RoadTeting of Bajaj Bike");
		 }
		 
	 public  void oiling() {
		 System.out.println("Oliling of Bajaj Bike");
	 }
	 
	 //factory method
	 public     BajajBike  createBike(String type) {
		    BajajBike bike=null;
		    if(type.equalsIgnoreCase("discover"))
		    	bike=new BajajDiscover();
		    else if(type.equalsIgnoreCase("platina"))
		    	bike=new BajajPlatina();
		    else if(type.equalsIgnoreCase("pulsor"))
		    	bike=new BajajPulsor();
		    else 
		    	 throw new IllegalArgumentException("Invalid Bike type");
		 return bike;
	 }
}

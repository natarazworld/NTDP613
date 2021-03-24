package com.nt.factory;

import com.nt.comp.BajajBike;

// class  having  Factory method desgin Pattern 
//(Let us assume this class is given by corporate office of Bajaj company that is there in mumbai)
public abstract class BajajBikeFactory {                  
   public   abstract void paint();
   public abstract void  assemble();
   public abstract void  oiling();
   public abstract void  roadTest();
   public  abstract BajajBike  createBike(String type);
   
     //method having Factory Method Design Pattern Logic
      public final  BajajBike orderBike(String type) {
    	   paint();
    	   assemble();
    	   oiling();
    	    BajajBike bike=createBike(type);
    	    roadTest();
    	    return bike;
      }
}

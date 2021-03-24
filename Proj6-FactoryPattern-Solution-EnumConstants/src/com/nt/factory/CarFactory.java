//CarFactory.java
package com.nt.factory;

import com.nt.comps.BalenorCar;
import com.nt.comps.Car;
import com.nt.comps.CarTyres;
import com.nt.comps.ErtigaCar;
import com.nt.comps.SwiftCar;

public class CarFactory {
   //static factory method
	public static  Car getCar(CarType type) {
		  Car car=null;
		  //create CarTyres object
		  CarTyres tyres=new CarTyres();
		    if(type==CarType.BALENO) {
		    	car=new BalenorCar(tyres);
		    }
		    else if(type==CarType.SWIFT) {
		    	car=new SwiftCar(tyres);
		    }
		    else if(type==CarType.ERTIGA) {
		    	car=new ErtigaCar(tyres);
		    }
		    else {
		    	throw  new IllegalArgumentException("invalid car type");
		    }
		    car.assemble();
		    car.roadTest();
		    return car;
	}//method
}//class

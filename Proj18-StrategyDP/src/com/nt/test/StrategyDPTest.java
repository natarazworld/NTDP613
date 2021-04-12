package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
	   //use Factory 
		Vehicle vehicle=VehicleFactory.getIstance("diesel");
		vehicle.drive("hyd", "goa");

	}

}

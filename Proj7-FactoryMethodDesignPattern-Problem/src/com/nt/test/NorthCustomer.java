//NorthCustomer.java
package com.nt.test;

import com.nt.comp.BajajBike;
import com.nt.factory.BajajNoidaFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bike=BajajNoidaFactory.createBike("pulsor");
		bike.drive();

	}

}

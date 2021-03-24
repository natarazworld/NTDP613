//SouthCustomer .java
package com.nt.test;

import com.nt.comp.BajajBike;
import com.nt.factory.BajajChennaiFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike=BajajChennaiFactory.createBike("pulsor");
		bike.drive();

	}

}

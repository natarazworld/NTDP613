//SouthCustomer .java
package com.nt.test;

import com.nt.comp.BajajBike;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.BajajBikeFactoryLocator;
import com.nt.factory.BajajChennaiFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory=BajajBikeFactoryLocator.buildBikeFactory("chennai");
		BajajBike bike=factory.orderBike("pulsor");
		bike.drive();

	}

}

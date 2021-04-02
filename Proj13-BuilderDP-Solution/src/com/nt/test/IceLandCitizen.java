package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class IceLandCitizen {
	public static void main(String[] args) {
		House house=HouseFactory.getInstance("ice");
		System.out.println(house);
		
	}

}

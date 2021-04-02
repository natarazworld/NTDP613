package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class EuropianCitizen {
	public static void main(String[] args) {
		House house=HouseFactory.getInstance("wooden");
		System.out.println(house);
		
	}

}

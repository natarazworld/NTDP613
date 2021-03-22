package com.nt.test;

import com.nt.comps.BalenorCar;
import com.nt.comps.Car;
import com.nt.comps.CarTyres;
import com.nt.factory.CarFactory;

public class Customer1 {

	public static void main(String[] args) {
		Car car1=CarFactory.getCar("baleno");
		System.out.println(car1);
	}

}

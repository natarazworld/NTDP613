package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.CarTyres;
import com.nt.comps.SwiftCar;
import com.nt.factory.CarFactory;

public class Customer2 {

	public static void main(String[] args) {
		Car car1=CarFactory.getCar("ertiga");
		System.out.println(car1);

	}

}

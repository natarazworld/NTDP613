package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.CarTyres;
import com.nt.comps.SwiftCar;
import com.nt.factory.CarFactory;
import com.nt.factory.CarType;

public class Customer2 {

	public static void main(String[] args) {
		Car car1=CarFactory.getCar(CarType.ERTIGA);
		System.out.println(car1);

	}

}

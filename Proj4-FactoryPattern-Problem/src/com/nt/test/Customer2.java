package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.CarTyres;
import com.nt.comps.SwiftCar;

public class Customer2 {

	public static void main(String[] args) {
		CarTyres tyres=new CarTyres();
		Car car=new SwiftCar(tyres);
		car.assemble();
		car.roadTest();
		System.out.println(car);

	}

}

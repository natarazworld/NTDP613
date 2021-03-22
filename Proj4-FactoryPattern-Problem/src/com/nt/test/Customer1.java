package com.nt.test;

import com.nt.comps.BalenorCar;
import com.nt.comps.Car;
import com.nt.comps.CarTyres;

public class Customer1 {

	public static void main(String[] args) {
		CarTyres tyres=new CarTyres();
		Car car=new BalenorCar(tyres);
		car.assemble();
		car.roadTest();
		System.out.println(car);

	}

}

package com.aw.test;

import com.aw.service.AccuWeatherService;
import com.aw.service.AccuWeatherServiceImpl;

public class AdapterDPTest {

	public static void main(String[] args) {
		//create Service class object
		AccuWeatherService  service=new AccuWeatherServiceImpl();
		//invoke method
		try {
		System.out.println(service.showTemperature("hyd"));
		}
		catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		System.out.println("=============================");
		try {
		System.out.println(service.showTemperature("delhi"));
		}
		catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		System.out.println("=============================");
		try {
		System.out.println(service.showTemperature("mumbai"));
		}
		catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}


	}//main
}//class

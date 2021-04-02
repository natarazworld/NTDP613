package com.nt.director;

import com.nt.builder.IHouseBuilder;
import com.nt.product.House;

public class CivilEngineer {
	private IHouseBuilder builder;
	
	public  CivilEngineer(IHouseBuilder builder) {
		System.out.println("CivilEngineer:: 1- param constructor");
		this.builder=builder;
	}
	
	//builder design pattern main method :: Defining process to construct the complext obj
	public   House  buildHouse() {
		builder.constructBasement();
		builder.constructStructor();
		builder.constructRoof();
		builder.constructInterior();
		House house=builder.getHouse(); 
		return house;
	}

}

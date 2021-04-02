//IglooHouseBuilder.java (ConcreteBuilder)
package com.nt.builder;

import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceCarvingInterior;
import com.nt.product.IceRoof;
import com.nt.product.IceStructor;


public class IglooHouseBuilder implements IHouseBuilder {
	private House house;
	
	public IglooHouseBuilder(House house) {
		System.out.println("IglooHouseBuilder.1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new IceRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new IceBasement());
	}

	@Override
	public void constructStructor() {
		house.setStructure(new IceStructor());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new IceCarvingInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}

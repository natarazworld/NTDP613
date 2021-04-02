//WoodenHouseBuilder.java (ConcreteBuilder)
package com.nt.builder;

import com.nt.product.House;
import com.nt.product.MixedInterior;
import com.nt.product.WoodenBasement;
import com.nt.product.WoodenInterior;
import com.nt.product.WoodenRoof;
import com.nt.product.WoodenStructor;

public class WoodenHouseBuilder implements IHouseBuilder {
	private House house;
	
	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder.1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new WoodenBasement());
	}

	@Override
	public void constructStructor() {
		house.setStructure(new WoodenStructor());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}

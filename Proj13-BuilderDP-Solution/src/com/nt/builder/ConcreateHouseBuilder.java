//ConcreateHouseBuilder.java (ConcreateBuilder)
package com.nt.builder;

import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteRoof;
import com.nt.product.ConcreteStructor;
import com.nt.product.GlassInterior;
import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceCarvingInterior;
import com.nt.product.IceRoof;
import com.nt.product.IceStructor;


public class ConcreateHouseBuilder implements IHouseBuilder {
	private House house;
	
	public ConcreateHouseBuilder(House house) {
		System.out.println("ConcreateBuilder.1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void constructStructor() {
		house.setStructure(new ConcreteStructor());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new GlassInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}

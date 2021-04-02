////MarbleHouseBuilder.java (ConcreateBuilder)
package com.nt.builder;

import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteRoof;
import com.nt.product.House;
import com.nt.product.IronStructor;
import com.nt.product.MixedInterior;

public class MarbleHouseBuilder implements IHouseBuilder {
	private House house;
	
	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder.1-param constructor()");
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
		house.setStructure(new IronStructor());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new MixedInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}

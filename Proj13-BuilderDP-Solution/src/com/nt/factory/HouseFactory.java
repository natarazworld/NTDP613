package com.nt.factory;

import com.nt.builder.ConcreateHouseBuilder;
import com.nt.builder.IHouseBuilder;
import com.nt.builder.IglooHouseBuilder;
import com.nt.builder.MarbleHouseBuilder;
import com.nt.builder.WoodenHouseBuilder;
import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class HouseFactory {

	public  static House  getInstance(String  type) {
		
		IHouseBuilder builder=null;
		House  house=new House();
		if(type.equalsIgnoreCase("wooden")) {
		  builder=new WoodenHouseBuilder(house)	;
		}
		else if(type.equalsIgnoreCase("ice")) {
			builder=new IglooHouseBuilder(house);
		}
		else if(type.equalsIgnoreCase("concrete")) {
			builder=new ConcreateHouseBuilder(house);
		}
		else if(type.equalsIgnoreCase("marble")) {
			builder=new MarbleHouseBuilder(house);
		}
		else 
			throw new IllegalArgumentException("Invalid House type");
		
		//create Director/Delegator object
		    CivilEngineer engineer=new CivilEngineer(builder);
		    house=engineer.buildHouse();
		    return house;
		
		
	}
	
}

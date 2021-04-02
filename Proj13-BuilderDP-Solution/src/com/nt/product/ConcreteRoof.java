package com.nt.product;

public class ConcreteRoof  implements IRoof {
     public ConcreteRoof() {
		System.out.println("ConcreteRoof:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteRoof []";
	}
     
     
}

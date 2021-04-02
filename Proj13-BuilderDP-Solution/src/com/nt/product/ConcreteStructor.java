package com.nt.product;

public class ConcreteStructor implements IStructure {
	
	public ConcreteStructor() {
		System.out.println("ConcreteStructor:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteStructor []";
	}
	
	

}

package com.nt.comps;

public class ErtigaCar implements Car {
	private CarTyres tyres;
	
		public ErtigaCar(CarTyres tyres) {
			System.out.println("ErtigaCar:1-param costructor");
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
	    System.out.println("ErtigaCar :: car is assembled");
	}

	@Override
	public void roadTest() {
		System.out.println("ErtigaCar ::  car is roated Tested");

	}

	@Override
	public String toString() {
		return "ErtigaCar with [tyres=" + tyres + "]";
	}
	
	

}
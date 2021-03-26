package com.nt.comp;

public class HireDotNetFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
	 System.out.println("HireDotNetFresher.conducting .net Technical Test");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
	  System.out.println("HireDotNetFresher.conducting .net CodingTest()");
		return true;
	}

}

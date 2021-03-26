package com.nt.comp;

public class HireUIFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
	 System.out.println("HireUIFresher.conducting UI Technical Test");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
	  System.out.println("HireUIFresher.conducting UI CodingTest()");
		return true;
	}

}

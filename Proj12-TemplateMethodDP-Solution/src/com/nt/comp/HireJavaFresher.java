package com.nt.comp;

public class HireJavaFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
	 System.out.println("HireJavaFresher.conducting java Technical Test");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
	  System.out.println("HireJavaFresher.conducting Java CodingTest()");
		return true;
	}

}

package com.nt.factory;

public class BajajBikeFactoryLocator {
	
	 //just factory pattern
	public static  BajajBikeFactory buildBikeFactory(String location) {
		  if(location.equalsIgnoreCase("chennai"))
			  return  new BajajChennaiFactory();
		  else if(location.equalsIgnoreCase("noida"))
			  return  new BajajNoidaFactory();
		  else
			  throw new IllegalArgumentException("invalid location");
	}

}

package com.imd.extenal;

import java.util.Random;

//External Comp  which gives given city temperateure FH degrees
public class WeatherReportCompImpl implements WeatherReportComp{
	   private static  WeatherReportComp  INSTANCE;
	   
	   private WeatherReportCompImpl() {
		   //no code
	   }
	   
	   //static factory method
	   public  static  WeatherReportComp getInstance() {
		   if(INSTANCE==null)
			    INSTANCE=new WeatherReportCompImpl();
		   return INSTANCE;
	   }
	   

	//B.method
	@Override
	public double getTemperature(int cityCode) {
	   //get Temperature from DB s/w or from  IOT device
		double temp;
		if(cityCode==100)
			temp= 100- Math.random();
		else if(cityCode==101)
			temp=101- Math.random();
		else if(cityCode==102)
			temp=102- Math.random();
		else if(cityCode==103)
			temp=99- Math.random();
		else
			throw new IllegalArgumentException("invalid City Code");
		return temp;
	}
	
	

}

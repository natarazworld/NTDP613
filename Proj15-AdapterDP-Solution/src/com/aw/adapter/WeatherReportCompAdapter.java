package com.aw.adapter;

import com.imd.extenal.WeatherReportComp;
import com.imd.extenal.WeatherReportCompImpl;

public class WeatherReportCompAdapter {
	
	public  double  fetchTemperature(String cityName) {
		  // get city code based on the city name  (we can get by taking to Db s/w or webService comp)
		   //(conversion1)
		  int cityCode=0;
		   if(cityName.equalsIgnoreCase("hyd"))
			      cityCode=100;
		   else if(cityName.equalsIgnoreCase("delhi"))
			     cityCode=101;
		   else if(cityName.equalsIgnoreCase("mumbai"))
			   cityCode=102;
		   else if(cityName.equalsIgnoreCase("chennai"))
			   cityCode=103;
		  else
			  throw new IllegalArgumentException("Invalid city name");
		   //get External Comp reference
		   WeatherReportComp  extComp=WeatherReportCompImpl.getInstance();
		   //invoke  b.method on external comp ref
		   double   temp=extComp.getTemperature(cityCode);  // Gives  temperature in  Fareignheit
		   // convert  Fareignheit  degrees to  celsius degree
		       temp=((temp-32)*5)/9;  //conversion2
		return temp;
	}

}

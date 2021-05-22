package com.nt.external;

import java.util.List;
import java.util.Random;

import com.nt.exception.InvalidStockIdException;

public class StockHistroyFinderImpl implements IStockHistroyFinder {

	@Override
	public List<Long> fetchStockHistory(long stockId)throws InvalidStockIdException {
		  long value1=new Random().nextInt(1000);
		  long value2=Math.round(value1+ (value1*0.1));
		  long value3=Math.round(value1- (value1*0.1));
		  
		  if(stockId==1001) {
			  value3=value3-10;   
		  }
		   else if(stockId==1002) {
			    value1=value1+100;
			    value2=value1-100;
			    value3=value1-50;
		   }
		   else if(stockId==1003) {
			   value1=value1-100;
			    value2=value1+100;
			    value3=value1-60;
		   }
		   else
			   throw new InvalidStockIdException("Invalid stockId");
		  
		return List.of(value1,value2,value3);  //java9
	}

}

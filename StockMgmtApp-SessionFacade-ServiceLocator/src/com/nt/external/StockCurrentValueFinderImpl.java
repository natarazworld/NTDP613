package com.nt.external;

import java.util.Random;

import com.nt.exception.InvalidStockIdException;

public class StockCurrentValueFinderImpl implements IStockCurrentValueFinder {

	@Override
	public long findStockCureentValue(long stockId) throws InvalidStockIdException {
		   long stockValue=new Random().nextInt(1000);
		   if(stockId==1001)
			   return stockValue+100;
		   else if(stockId==1002)
			   return stockValue+125;
		   else if(stockId==1003)
			   return stockValue+75;
		   else
			   throw new InvalidStockIdException("Invalid stockId"); 
	}

}

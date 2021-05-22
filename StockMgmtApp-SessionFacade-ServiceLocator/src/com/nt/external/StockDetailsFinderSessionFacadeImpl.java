package com.nt.external;

import java.util.List;

import com.nt.dto.StockDetailsDTO;
import com.nt.exception.InvalidStockIdException;
import com.nt.exception.InvalidStockNameException;

public class StockDetailsFinderSessionFacadeImpl implements IStockDetailsFinderSessionFacade {

	@Override
	public StockDetailsDTO findCompleteStockDetailsByName(String stockName)
			throws InvalidStockIdException, InvalidStockNameException {
		//invoke other comps  (here multiple jndi lookups should happen ..but we creating objs directly becoz we have 
		// external comps as the ordinary java classes
		 IStockIdFinder  comp1=new StockIdFinderImpl();
		  long stockId=comp1.findStockIdByStockName(stockName);
		  
		  IStockCurrentValueFinder  comp2=new StockCurrentValueFinderImpl();
		  long currentValue=comp2.findStockCureentValue(stockId);
		  
		  IStockHistroyFinder  comp3=new StockHistroyFinderImpl();
		  List<Long>  histroyList=comp3.fetchStockHistory(stockId);
		  
		  IStockFutureFinder  comp4=new StockFutureFinderImpl();
		  List<Long>  futureList=comp4.fetchStockFuture(stockId);
		  //prepare  DTO class object having multiple details
		     StockDetailsDTO  dto=new StockDetailsDTO();
		     dto.setStockId(stockId); dto.setStockName(stockName);
		     dto.setCurrentValue(currentValue);     dto.setHistoryValues(histroyList); dto.setFutureValues(futureList);
		     
		return dto;
	}//main
}//class

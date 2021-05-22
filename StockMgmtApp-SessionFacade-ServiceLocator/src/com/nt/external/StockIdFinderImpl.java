package com.nt.external;

import com.nt.exception.InvalidStockNameException;

public class StockIdFinderImpl implements IStockIdFinder {

	@Override
	public long findStockIdByStockName(String stockName) throws InvalidStockNameException {
		
		if(stockName.equalsIgnoreCase("SBI"))
			return  1001;
		else if(stockName.equalsIgnoreCase("ICICI"))
			return 1002;
		else if(stockName.equalsIgnoreCase("Reliance"))
			return 1003;
		else
			throw new InvalidStockNameException("wrong stock name");
	}

}

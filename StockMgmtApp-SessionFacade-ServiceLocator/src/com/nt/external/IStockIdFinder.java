package com.nt.external;

import com.nt.exception.InvalidStockNameException;

public interface IStockIdFinder {
   public   long   findStockIdByStockName(String stockName)throws InvalidStockNameException;
}

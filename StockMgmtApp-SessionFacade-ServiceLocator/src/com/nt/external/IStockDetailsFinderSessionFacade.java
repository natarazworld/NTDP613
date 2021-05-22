package com.nt.external;

import com.nt.dto.StockDetailsDTO;
import com.nt.exception.InvalidStockIdException;
import com.nt.exception.InvalidStockNameException;

public interface IStockDetailsFinderSessionFacade {
       public  StockDetailsDTO 
          findCompleteStockDetailsByName(String stockName)throws InvalidStockIdException,InvalidStockNameException ;
}

package com.nt.external;

import com.nt.exception.InvalidStockIdException;

public interface IStockCurrentValueFinder {
      public  long  findStockCureentValue(long stockId)throws InvalidStockIdException;
}

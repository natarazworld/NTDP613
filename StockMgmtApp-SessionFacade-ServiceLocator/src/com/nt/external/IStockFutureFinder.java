package com.nt.external;

import java.util.List;

import com.nt.exception.InvalidStockIdException;

public interface IStockFutureFinder {
       public List<Long>  fetchStockFuture(long stockId)throws InvalidStockIdException;
}

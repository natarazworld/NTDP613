package com.nt.external;

import java.util.List;

import com.nt.exception.InvalidStockIdException;

public interface IStockHistroyFinder {
       public List<Long>  fetchStockHistory(long stockId)throws InvalidStockIdException;
}

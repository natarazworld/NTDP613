package com.nt.delegate;

import com.nt.dto.StockDetailsDTO;
import com.nt.exception.InternalProblemException;

public interface IUpStoxStockMgmtBusinessDelegate {
    public StockDetailsDTO  fetchStockDetailsByName(String stockName)throws  InternalProblemException;
}

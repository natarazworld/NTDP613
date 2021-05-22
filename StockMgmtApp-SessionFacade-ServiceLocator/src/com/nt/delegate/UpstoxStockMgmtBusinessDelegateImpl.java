package com.nt.delegate;

import com.nt.dto.StockDetailsDTO;
import com.nt.exception.InternalProblemException;
import com.nt.exception.InvalidStockIdException;
import com.nt.exception.InvalidStockNameException;
import com.nt.external.IStockDetailsFinderSessionFacade;
import com.nt.locator.StockDetailsSessionFacadeServiceLocator;

public class UpstoxStockMgmtBusinessDelegateImpl implements IUpStoxStockMgmtBusinessDelegate {

	@Override
	public StockDetailsDTO fetchStockDetailsByName(String stockName) throws InternalProblemException {
		
		try {
			// get SessionFacade comp ref usisng ServiceLocator
			StockDetailsSessionFacadeServiceLocator locator=StockDetailsSessionFacadeServiceLocator.getInstance();
			IStockDetailsFinderSessionFacade  facade=locator.getFacade("stockJndi");
			//invoke b.method
			StockDetailsDTO  dto=facade.findCompleteStockDetailsByName(stockName);
			return dto;
		}
		catch(InvalidStockNameException isne) {
			throw new InternalProblemException(isne.getMessage());
		}
		catch(InvalidStockIdException isie) {
			throw new InternalProblemException(isie.getMessage());
		}
		
	}//method

}//class

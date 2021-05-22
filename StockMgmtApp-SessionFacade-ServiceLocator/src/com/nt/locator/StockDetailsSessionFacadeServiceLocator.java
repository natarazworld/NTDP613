package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.external.IStockDetailsFinderSessionFacade;
import com.nt.external.StockDetailsFinderSessionFacadeImpl;

public class StockDetailsSessionFacadeServiceLocator {
	private static StockDetailsSessionFacadeServiceLocator  INSTANCE;
	private  Map<String,IStockDetailsFinderSessionFacade> cacheMap;
	
	private StockDetailsSessionFacadeServiceLocator() {
		cacheMap=new HashMap();
	}
	
	//static factory method
	public static   StockDetailsSessionFacadeServiceLocator  getInstance() {
		   if(INSTANCE==null)
			   INSTANCE=new StockDetailsSessionFacadeServiceLocator();
		   return INSTANCE;
	}
	
	public  IStockDetailsFinderSessionFacade  getFacade(String jndi) {
		if(!cacheMap.containsKey(jndi)) {
			//here also we shoud write lookup .. since we have taken  SessionFacade as ordinary java class
			//we are object directly..
			IStockDetailsFinderSessionFacade  facade=new StockDetailsFinderSessionFacadeImpl();
			cacheMap.put(jndi,facade);
		}
		return  cacheMap.get(jndi);
	}

}

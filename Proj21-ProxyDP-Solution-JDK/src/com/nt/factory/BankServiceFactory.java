package com.nt.factory;

import java.lang.reflect.Proxy;

import com.nt.component.BankServiceImpl;
import com.nt.component.IBankService;
import com.nt.proxy.BankProxyHelper;

public class BankServiceFactory {
	
     //factory pattern
	public static IBankService  getInstance(boolean demonitisation) {
		IBankService service=null;
		 if(demonitisation)
		    service=(IBankService)Proxy.newProxyInstance(IBankService.class.getClassLoader(),
		         		                                      new Class[] {IBankService.class},
			      		                                      new BankProxyHelper());
		 else
			   service= new  BankServiceImpl(); //real object
		 
		return service;
	}//method
}//class

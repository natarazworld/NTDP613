package com.nt.factory;

import com.nt.component.BankServiceImpl;
import com.nt.component.IBankService;
import com.nt.proxy.BankServiceProxyImpl;

public class BankServiceFactory {
	
     //factory pattern
	public static IBankService  getInstance(boolean demonitisation) {
		IBankService service=null;
		 if(demonitisation)
			   service=new BankServiceProxyImpl(); //proxy class obj
		 else
			   service= new  BankServiceImpl(); //real object
		return service;
	}//method
}//class

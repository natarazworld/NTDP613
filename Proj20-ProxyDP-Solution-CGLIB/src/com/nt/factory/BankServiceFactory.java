package com.nt.factory;

import com.nt.component.BankServiceImpl;
import com.nt.proxy.BankProxyHelper;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
     //factory pattern
	public static BankServiceImpl  getInstance(boolean demonitisation) {
		BankServiceImpl service=null;
		 if(demonitisation)
			   service=(BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankProxyHelper());  //generates and gives InMemory proxy class obj
		 else
			   service= new  BankServiceImpl(); //real object
		return service;
	}//method
}//class

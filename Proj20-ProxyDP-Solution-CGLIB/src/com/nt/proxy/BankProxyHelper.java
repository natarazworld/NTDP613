package com.nt.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BankProxyHelper implements MethodInterceptor {

	@Override
	public Object intercept(Object real, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		 Object retVal=null;
	      if(method.getName().equalsIgnoreCase("withdraw")) {
	    	    if(((Double)args[1])<=4000)
	    	    	  retVal=proxy.invokeSuper(real,args);  //real method
	    	    else {
	    	    	args[1]=4000;  //amount arg
	    	    	retVal=proxy.invokeSuper(real, args);  //real method
	    	    	retVal=retVal+" only Rs.4000 can be withdrawn at max";
	    	    }
	      }//if
	      else {
	    	  retVal=proxy.invokeSuper(real,args); 
	      }
		return retVal;
	}

}

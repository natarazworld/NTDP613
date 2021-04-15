package com.nt.proxy;

import com.nt.component.BankServiceImpl;
import com.nt.component.IBankService;

public class BankServiceProxyImpl implements IBankService {
    private IBankService real;
    public BankServiceProxyImpl() {
		real=new BankServiceImpl();
	}
	@Override
	public String withdraw(long acno, double amount) {
		String msg=null;
		 if(amount<=4000)
			 msg=real.withdraw(acno, amount);
		 else {
			 msg=real.withdraw(acno,4000);
			 msg=msg+"(*** Only max of 4000 can be withdraw at a time During transition period ****)";
		 }
		return msg;
	}

}

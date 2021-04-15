package com.nt.component;

public class BankServiceImpl implements IBankService {

	@Override
	public String withdraw(long acno, double amount) {
		return "withdrawing amount ::"+amount+" from account number::"+acno;
	}

}

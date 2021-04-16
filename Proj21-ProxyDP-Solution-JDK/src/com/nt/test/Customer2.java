package com.nt.test;

import java.util.Arrays;

import com.nt.component.IBankService;
import com.nt.factory.BankServiceFactory;

public class Customer2 {
     public static void main(String[] args) {
	      IBankService  service=BankServiceFactory.getInstance(false);
	      System.out.println(service.getClass()+".... "+service.getClass().getSuperclass()+"......"+Arrays.toString(service.getClass().getInterfaces()));
	      System.out.println(service.withdraw(10002, 30000));
	      System.out.println("=========================");
	      System.out.println(service.withdraw(10002, 3000));
	}
}

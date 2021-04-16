package com.nt.test;

import java.util.Arrays;

import com.nt.component.BankServiceImpl;
import com.nt.factory.BankServiceFactory;

public class Customer2 {
     public static void main(String[] args) {
	      BankServiceImpl  service=BankServiceFactory.getInstance(false);
	      System.out.println(service.getClass()+" ..... "+service.getClass().getSuperclass());
	      System.out.println(Arrays.toString(service.getClass().getDeclaredMethods()));
	      System.out.println(service.withdraw(10002, 30000));
	      System.out.println("=========================");
	      System.out.println(service.withdraw(10002, 3000));
	}
}

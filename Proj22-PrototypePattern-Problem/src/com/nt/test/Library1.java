package com.nt.test;

import com.nt.comp.BookCollection;
import com.nt.factory.BookCollectionFactory;

public class Library1 {
   public static void main(String[] args) {
	  BookCollection fbooks=BookCollectionFactory.getBookCollection("fictional");
	  System.out.println(fbooks);
	  System.out.println("-----------------------------");
	  BookCollection rbooks=BookCollectionFactory.getBookCollection("reality");
	  System.out.println(rbooks);
	  System.out.println("============================");
	  
	  BookCollection fbooks1=BookCollectionFactory.getBookCollection("fictional");
	  System.out.println(fbooks1);
	  System.out.println("-----------------------------");
	  BookCollection rbooks1=BookCollectionFactory.getBookCollection("reality");
	  System.out.println(rbooks1);
	  
	  
	  
	   
	   
}
}

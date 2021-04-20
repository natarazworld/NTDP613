package com.nt.test;

import com.nt.comp.BookCollection;
import com.nt.factory.BookCollectionFactory;

public class Library1 {
   public static void main(String[] args)throws Exception {
	  BookCollection fbooks=BookCollectionFactory.getBookCollection("fictional");
	  System.out.println(fbooks);
	  
	  BookCollection fbooks1=BookCollectionFactory.getBookCollection("fictional");
	  System.out.println(fbooks1);
	  // remove one book using fbooks1  from List collection   
	     fbooks1.getBooks().remove(0);  //Becoz of shallow cloing the change will reflect fbooks which against of 
	                                                              // prototype DP
	     System.out.println(fbooks.getBooks().size()+"     "+fbooks1.getBooks().size());  //gives 19   and 19
	  
	  System.out.println("============================");
	  
	  BookCollection rbooks=BookCollectionFactory.getBookCollection("reality");
	  System.out.println(rbooks);
	  System.out.println("-----------------------------");
	  BookCollection rbooks1=BookCollectionFactory.getBookCollection("reality");
	  System.out.println(rbooks1);
   }//main
}//class

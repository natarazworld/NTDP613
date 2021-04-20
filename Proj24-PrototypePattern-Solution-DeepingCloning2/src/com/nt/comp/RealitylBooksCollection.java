package com.nt.comp;

import com.nt.model.Book;

public class RealitylBooksCollection extends BookCollection {

	@Override
	public void loadBooks() {
		//write  jdbc code to get books from DB s/w and load books collection(List Collection)
		    // ......
		    // ......
		System.out.println("hitting Db s/w to get realify books");	
		Book b=null;
		setType("Reality");
		 for(int i=1;i<=20;++i) {
			 b=new Book(1000+i,"Reality Book-"+i);
			 getBooks().add(b);
		 }
       System.out.println("Books are loaded books collection from Db s/w db table records");
	}//method
}//class

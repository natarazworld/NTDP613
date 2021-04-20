package com.nt.comp;

import com.nt.model.Book;

public class FictionalBooksCollection extends BookCollection {

	@Override
	public void loadBooks() {
		//write  jdbc code to get books from DB s/w and load books collection(List Collection)
		    // ......
		    // ......
		System.out.println("hitting Db s/w to get fictional books");
		setType("finctional");
		Book b=null;
		 for(int i=1;i<=20;++i) {
			 b=new Book(1000+i,"FictionalBook-"+i);
			 getBooks().add(b);
		 }
       System.out.println("Books are loaded books collection from Db s/w db table records");
	}//method
}//class

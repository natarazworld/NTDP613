package com.nt.factory;

import com.nt.comp.BookCollection;
import com.nt.comp.FictionalBooksCollection;
import com.nt.comp.RealitylBooksCollection;

public class BookCollectionFactory {

	public static  BookCollection  getBookCollection(String type) {
		 BookCollection collection=null;
		 if(type.equalsIgnoreCase("fictional")) {
			 collection=new FictionalBooksCollection();
			 
		 }
		 else if(type.equalsIgnoreCase("reality"))  {
			 collection=new RealitylBooksCollection();
		 }
		 else
			 throw new IllegalArgumentException("invalid book type");
		  collection.loadBooks();
		 return collection;
	}
}

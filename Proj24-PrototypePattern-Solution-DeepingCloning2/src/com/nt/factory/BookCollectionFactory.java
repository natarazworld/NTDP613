package com.nt.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nt.comp.BookCollection;
import com.nt.comp.FictionalBooksCollection;
import com.nt.comp.RealitylBooksCollection;
import com.nt.model.Book;

public class BookCollectionFactory {
	private static  Map<String,BookCollection> cacheMap=new HashMap();
	
	static {
		// In App startup itself Load the all types of books from Db s/w and keep then in cache
		 BookCollection fcollection=new FictionalBooksCollection();
		 fcollection.loadBooks();
		 BookCollection rcollection=new RealitylBooksCollection();
		 rcollection.loadBooks();
		 
		 //keep BookCollection in the cahe
		   cacheMap.put("fictional",fcollection);
		   cacheMap.put("reality",rcollection);
	}//static block

	public static  BookCollection  getBookCollection(String type)throws Exception {
		//Deep cloning   
		BookCollection originalCollection=cacheMap.get(type);
		   BookCollection clonedCollection=(BookCollection) originalCollection.clone();
		   String otype=originalCollection.getType();
		   String ctype=new String(otype);
		   List<Book> obooks=originalCollection.getBooks();
		   List<Book> cbooks=new ArrayList();
		   for(Book ob:obooks) {
			   Book cb=(Book)ob.clone();
			   cbooks.add(cb);
		   }
		   //set every thing to clonedBookCollection object
		   clonedCollection.setType(ctype);
		   clonedCollection.setBooks(cbooks);
		return clonedCollection; // deeply clonned object..
	}
}

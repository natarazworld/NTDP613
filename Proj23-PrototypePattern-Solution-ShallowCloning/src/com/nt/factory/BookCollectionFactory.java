package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.BookCollection;
import com.nt.comp.FictionalBooksCollection;
import com.nt.comp.RealitylBooksCollection;

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
		return  (BookCollection) cacheMap.get(type).clone();  //shallow cloning..
	}
}

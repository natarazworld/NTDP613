package com.nt.comp;

import java.util.ArrayList;
import java.util.List;

import com.nt.model.Book;

public abstract class BookCollection implements Cloneable {
    private String type;
    private  List<Book>  books=new ArrayList();
    
    
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public   abstract  void loadBooks();
	
	@Override
	public String toString() {
		return "BookCollection [type=" + type + ", books=" + books + "]";
	}
}

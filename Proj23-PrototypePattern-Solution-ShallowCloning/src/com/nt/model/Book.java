package com.nt.model;

public class Book {
	private  int bookId;
	private String  bookName;
	
	public Book(int bookId,String bookName) {
		System.out.println("Book::2-param constructor");
		   this.bookId=bookId;
		   this.bookName=bookName;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
	
	

}

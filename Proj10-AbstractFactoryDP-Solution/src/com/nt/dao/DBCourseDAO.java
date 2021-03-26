//DBCourseDAO.java
package com.nt.dao;

public class DBCourseDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("DBCourseDAO.inserting course info to DB table");
	}
}

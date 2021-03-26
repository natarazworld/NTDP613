//DBStudentDAO.java
package com.nt.dao;

public class DBStudentDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("DBStudentDAO.inserting student info to DB table");
	}
}

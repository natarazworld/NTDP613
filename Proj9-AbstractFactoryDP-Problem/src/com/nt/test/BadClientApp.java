//BadClient.java
package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class BadClientApp {

	public static void main(String[] args) {
		DAO  stDAO=ExcelDAOFactory.createDAO("student");
		DAO  crsDAO=DBDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}

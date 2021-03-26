//GoodClient.java
package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.ExcelDAOFactory;

public class GoodClientApp {

	public static void main(String[] args) {
		DAO  stDAO=ExcelDAOFactory.createDAO("student");
		DAO  crsDAO=ExcelDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}

//GoodClient.java
package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryBuilder;

public class GoodClientApp1 {

	public static void main(String[] args) {
		DAOFactory  dbDAOFactory=DAOFactoryBuilder.buildDAOFactory("EXCEL");
		DAO  stDAO=dbDAOFactory.createDAO("student");
		DAO  crsDAO=dbDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}

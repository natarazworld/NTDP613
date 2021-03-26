//DBDAOFactory.java
package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.DBCourseDAO;
import com.nt.dao.DBStudentDAO;


public class DBDAOFactory implements DAOFactory {
	 //factory pattern 
     public  DAO  createDAO(String type) {
    	    if(type.equalsIgnoreCase("student"))
    	    	 return new  DBStudentDAO();
    	    else if(type.equalsIgnoreCase("course"))
    	    	return new  DBCourseDAO();
    	    else
    	    throw new IllegalArgumentException("Invalid DAO type");
     }
}

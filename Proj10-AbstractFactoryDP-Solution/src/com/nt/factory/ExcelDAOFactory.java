//ExcelDAOFactory.java
package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.ExcelCourseDAO;
import com.nt.dao.ExcelStudentDAO;


public class ExcelDAOFactory implements DAOFactory {
	 //factory pattern 
     public   DAO  createDAO(String type) {
    	    if(type.equalsIgnoreCase("student"))
    	    	 return new  ExcelStudentDAO();
    	    else if(type.equalsIgnoreCase("course"))
    	    	return new  ExcelCourseDAO();
    	    else
    	    throw new IllegalArgumentException("Invalid DAO type");
     }
}

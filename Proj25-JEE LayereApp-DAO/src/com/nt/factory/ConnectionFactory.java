package com.nt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ConnectionFactory {
	private static Logger logger=Logger.getLogger(ConnectionFactory.class);
	static {
		try {
			//activate  log4j  by loading its log4j.properties file
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
			logger.debug("Log4j activated");
		}
		catch(Exception e) {
			logger.error("Problem in Log4j activation");
			e.printStackTrace();
			
		}
	}//static block
	
	public static  Connection  makeConenction(String url,String user,String pwd)throws Exception {
		Connection con=null;
		logger.debug("makeConnection(-,-,-) method");
			try {
			 con=DriverManager.getConnection(url,user,pwd);
			 logger.info("Connection is established");
		}
		catch(SQLException se) {
            se.printStackTrace();
            logger.error("Problem in Connection  establishment"+se.getMessage());
            throw se;
		}
		catch(Exception e) {
			logger.fatal("unProblem in Connection  establishment");
			e.printStackTrace();
			throw e;
		}
		
		return con;
	}//method

}//calss

package com.nt.factory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.dao.ITicketBookingDAO;
import com.nt.dao.TicketBookingDAOImpl;

public class TicketBookingDAOFactory {
	private static Logger logger=Logger.getLogger(TicketBookingDAOFactory.class);
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
	
    public  static  ITicketBookingDAO  getInstance(String type) {
    	logger.debug("getInstance(-) method");
    	   ITicketBookingDAO dao=null;
    	     if(type.equalsIgnoreCase("jdbc"))
    	    	 dao=new TicketBookingDAOImpl();
    	     else
    	    	 throw new IllegalArgumentException("invalid DAO type");
    	     
    	     logger.info("creating and returung    DAO class object");
    	     
    	     return dao;
    }
}

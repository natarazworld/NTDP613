package com.nt.factory;

import com.nt.dao.ITicketBookingDAO;
import com.nt.dao.TicketBookingDAOImpl;

public class TicketBookingDAOFactory {
    public  static  ITicketBookingDAO  getInstance(String type) {
    	   ITicketBookingDAO dao=null;
    	     if(type.equalsIgnoreCase("jdbc"))
    	    	 dao=new TicketBookingDAOImpl();
    	     else
    	    	 throw new IllegalArgumentException("invalid DAO type");
    	     
    	     return dao;
    }
}

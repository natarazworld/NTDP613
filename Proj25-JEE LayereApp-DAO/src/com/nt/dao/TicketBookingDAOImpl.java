package com.nt.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.bo.TicketBookingDetailsBO;
import com.nt.factory.ConnectionFactory;

public class TicketBookingDAOImpl implements ITicketBookingDAO {
	private static final String  INSERT_MOVIE_TICKET_BOOKINGS_QUERY="INSERT INTO MOVIE_TICKET_BOOKINGS VALUES(TICKETID_SEQ.NEXTVAL,?,?,?,?,?)";
	private static Properties props;
	private static Logger logger=Logger.getLogger(TicketBookingDAOImpl.class);
	static {
		try {
			//activate  log4j  by loading its log4j.properties file
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
			logger.debug("Log4j activated");
			//Load properties file
			InputStream is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			logger.debug("jdbc properties file loaded");
			//load properties file info to java.util.Properties class obj
			props=new Properties();
			props.load(is);
			logger.debug("jdbc properties file info is copied to  java.util.Properties class object");
		}
		catch(IOException ioe) {
			logger.error("propblem in locating jdbc.propperties file");
			ioe.printStackTrace();
		}
		catch(Exception e) {
			logger.error("unpropblem in locating jdbc.propperties file");
			e.printStackTrace();
		}
	}//static block
	

	/*@Override
	public int insert(TicketBookingDetailsBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
	   try {
		   //get JDBC connection using Connection Factory
		    con=ConnectionFactory.makeConenction(props.getProperty("jdbc.url"),
				                                                                                       props.getProperty("db.user"),
				                                                                                        props.getProperty("db.pwd"));
		   //create PreparedStatement object
		    ps=con.prepareStatement(INSERT_MOVIE_TICKET_BOOKINGS_QUERY);
		    //set values to Query params
		    ps.setString(1,bo.getCustName());
		    ps.setInt(2,bo.getTicketsCount());
		    ps.setString(3, bo.getTicketType());
		    ps.setString(4, bo.getSeatNos());
		    ps.setFloat(5, bo.getBillAmount());
		    //execute the Query
		     count=ps.executeUpdate();
	   }//try
	   catch(SQLException se) {
		   se.printStackTrace();
		   throw se;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
		   throw e;
	   }
	   finally {
		   //close jdbc objs
		   try {
			   if(ps!=null)
				   ps.close();
		   }
		   catch(SQLException se) {
			   se.printStackTrace();
		   }
		   try {
			   if(con!=null)
				   con.close();
		   }
		   catch(SQLException se) {
			   se.printStackTrace();
		   }
	   }
	   
		return count;
	}*/
	
	@Override
	public int insert(TicketBookingDetailsBO bo) throws Exception {
		int count=0;
		logger.debug(" insert(-) of  TicketBookingDAOImpl class");
       try( //get JDBC connection using Connection Factory
    	    Connection con=ConnectionFactory.makeConenction(props.getProperty("jdbc.url"),
    			                                                                                       props.getProperty("db.user"),
    			                                                                                        props.getProperty("db.pwd"));
    		   //create PrpearedSatetement obj
       	    PreparedStatement ps=con.prepareStatement(INSERT_MOVIE_TICKET_BOOKINGS_QUERY);
    		   ){
    	   logger.info(" jdbc con is gathered from  Connection factory");
    	   logger.debug(" PreparedStatement obj is created having pre-compiled SQL query");


    	    //set values to Query params
    	    ps.setString(1,bo.getCustName());
    	    ps.setInt(2,bo.getTicketsCount());
    	    ps.setString(3, bo.getTicketType());
    	    ps.setString(4, bo.getSeatNos());
    	    ps.setFloat(5, bo.getBillAmount());
    	    logger.debug(" Values are set to pre-compiled SQL Query parameters");
    	    //execute the Query
    	     count=ps.executeUpdate();
    	     logger.info("pre-compiled SQL query is executed");
       }//try
       catch(SQLException se) {
    	   logger.error("problem in  JDBC code execution");
    	   se.printStackTrace();
    	   throw se;
       }
       catch(Exception e) {
    	   logger.fatal("unknwon problem in  JDBC code execution");
    	   e.printStackTrace();
    	   throw e;
       }
		return count;
	}//method

}//class

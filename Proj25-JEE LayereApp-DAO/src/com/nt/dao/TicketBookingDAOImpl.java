package com.nt.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.nt.bo.TicketBookingDetailsBO;
import com.nt.factory.ConnectionFactory;

public class TicketBookingDAOImpl implements ITicketBookingDAO {
	private static final String  INSERT_MOVIE_TICKET_BOOKINGS_QUERY="INSERT INTO MOVIE_TICKET_BOOKINGS VALUES(TICKETID_SEQ.NEXTVAL,?,?,?,?,?)";
	private static Properties props; 
	static {
		try {
			//Load properties file
			InputStream is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			//load properties file info to java.util.Properties class obj
			props=new Properties();
			props.load(is);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
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
       try( //get JDBC connection using Connection Factory
    	    Connection con=ConnectionFactory.makeConenction(props.getProperty("jdbc.url"),
    			                                                                                       props.getProperty("db.user"),
    			                                                                                        props.getProperty("db.pwd"));
    		   //create PrpearedSatetement obj
       	    PreparedStatement ps=con.prepareStatement(INSERT_MOVIE_TICKET_BOOKINGS_QUERY);
    		   ){

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
		return count;
	}//method

}//class

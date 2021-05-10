package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.controller.MainController;
import com.nt.vo.TicketBookingDetailsVO;

public class JEELayeredAppTest {
	private static Logger logger=Logger.getLogger(JEELayeredAppTest.class);
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
	public static void main(String[] args) {
		logger.debug("main(-) method");
		// read inputs and store them into VO class object
		TicketBookingDetailsVO vo=new TicketBookingDetailsVO();
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name::");
		String name=sc.next();
		System.out.println("enter tickets count::");
		int tktsCount =sc.nextInt();
		System.out.println("Choose Ticket type::");
		String tktType=sc.next();
		System.out.println("Choose seat nos::");
		String seatNos="";
		for(int i=1;i<=tktsCount;++i) {
			System.out.println("Enter "+i+" seat no:");
			seatNos=seatNos+","+sc.next();
		}
		logger.debug("inputs are read from enduser");
		//prepare VO class object
		vo.setCustName(name);
		vo.setTicketType(tktType);
		vo.setTicketsCount(String.valueOf(tktsCount));
		vo.setSeatNos(seatNos);
		logger.debug("inputs are stored into VO class obj");
		//invoke methods  by creating object from Controller
		MainController controller=new MainController();
		logger.info("controller class obj is created");
		try {
			String result=controller.processTicketBooking(vo);
			logger.info("b.method is invoked on controller class obj");
			System.out.println(result);
		}
		catch(SQLException se) {
			se.printStackTrace();
			logger.error("Internal DB DB Problem::"+se.getMessage());
			System.err.println("Internal DB DB Problem::"+se.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.error("unknown DB Problem::"+e.getMessage());
			System.err.println("unknow problem:: "+e.getMessage());
		}
		logger.debug("end  of main(-) method");
	}//main
}//class

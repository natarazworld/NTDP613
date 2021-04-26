package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.nt.controller.MainController;
import com.nt.vo.TicketBookingDetailsVO;

public class JEELayeredAppTest {

	public static void main(String[] args) {
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
		//prepare VO class object
		vo.setCustName(name);
		vo.setTicketType(tktType);
		vo.setTicketsCount(String.valueOf(tktsCount));
		vo.setSeatNos(seatNos);
		//invoke methods  by creating object from Controller
		MainController controller=new MainController();
		try {
			String result=controller.processTicketBooking(vo);
			System.out.println(result);
		}
		catch(SQLException se) {
			se.printStackTrace();
			System.err.println("Internal DB DB Problem::"+se.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Internal problem:: "+e.getMessage());
		}
	}//main
}//class

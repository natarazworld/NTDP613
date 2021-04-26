package com.nt.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.bo.TicketBookingDetailsBO;
import com.nt.dao.ITicketBookingDAO;
import com.nt.dto.TicketBookingDetailsDTO;
import com.nt.factory.TicketBookingDAOFactory;

public class TicketBookingMgmtServiceImpl implements ITicketBookingMgmtService {
	private static Properties props;
	private ITicketBookingDAO  dao;
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
	
	public TicketBookingMgmtServiceImpl() {
		dao=TicketBookingDAOFactory.getInstance(props.getProperty("dao.type"));
	}
	

	@Override
	public String bookTickets(TicketBookingDetailsDTO dto) throws Exception {
		
		// calc bill Amount
		float  price=0.0f;
		if(dto.getTicketType().equalsIgnoreCase("reclainer"))
			price=200.0f;
		else
			price=150.0f;
		float billAmt=0.0f;
		billAmt=dto.getTicketsCount()*price;
		// prepare BO class obj  having Persistable data
		TicketBookingDetailsBO  bo=new TicketBookingDetailsBO();
		bo.setCustName(dto.getCustName());
		bo.setSeatNos(dto.getSeatNos());
		bo.setTicketsCount(dto.getTicketsCount());
		bo.setTicketType(dto.getTicketType());
		bo.setBillAmount(billAmt);
        //use DAO
		int count=dao.insert(bo);

		return count==0?"Toickets are not booked (problem in booking tickets)":"Tickets are booked";
	}

}

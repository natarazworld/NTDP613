package com.nt.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.bo.TicketBookingDetailsBO;
import com.nt.dao.ITicketBookingDAO;
import com.nt.dao.TicketBookingDAOImpl;
import com.nt.dto.TicketBookingDetailsDTO;
import com.nt.factory.TicketBookingDAOFactory;

public class TicketBookingMgmtServiceImpl implements ITicketBookingMgmtService {
	private static Properties props;
	private ITicketBookingDAO  dao;
	private static Logger logger=Logger.getLogger(TicketBookingMgmtServiceImpl.class);
	static {
		try {
			//activate  log4j  by loading its log4j.properties file
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
			logger.debug("Log4j activated");
			//Load properties file
			InputStream is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			logger.debug("jdbc.properties file is loaded");
			//load properties file info to java.util.Properties class obj
			props=new Properties();
			props.load(is);
			logger.debug("jdbc.properties file info is copied to java.util.Properties class object");
		}
		catch(IOException ioe) {
			logger.error("problem  in loading jdbc.properties file or log4j.properties file");
			ioe.printStackTrace();
		}
		catch(Exception e) {
			logger.fatal("unknown problem  in loading jdbc.properties file or log4j.properties file");
			e.printStackTrace();
		}
	}//static block
	
	public TicketBookingMgmtServiceImpl() {
		dao=TicketBookingDAOFactory.getInstance(props.getProperty("dao.type"));
		logger.info("DAO class object is gathered");
	}
	

	@Override
	public String bookTickets(TicketBookingDetailsDTO dto) throws Exception {
		logger.debug("bookTickes(-) method");
		// calc bill Amount
		float  price=0.0f;
		if(dto.getTicketType().equalsIgnoreCase("reclainer"))
			price=200.0f;
		else
			price=150.0f;
		float billAmt=0.0f;
		billAmt=dto.getTicketsCount()*price;
		logger.debug("b.logic executed and bill amount calcaulated");
		// prepare BO class obj  having Persistable data
		TicketBookingDetailsBO  bo=new TicketBookingDetailsBO();
		bo.setCustName(dto.getCustName());
		bo.setSeatNos(dto.getSeatNos());
		bo.setTicketsCount(dto.getTicketsCount());
		bo.setTicketType(dto.getTicketType());
		bo.setBillAmount(billAmt);
		 logger.debug("BO class obj is created");
        //use DAO
		int count=dao.insert(bo);
        logger.info("DAO class insert(-) method is invoked");
		return count==0?"Toickets are not booked (problem in booking tickets)":"Tickets are booked";
	}

}

package com.nt.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.dao.TicketBookingDAOImpl;
import com.nt.dto.TicketBookingDetailsDTO;
import com.nt.service.ITicketBookingMgmtService;
import com.nt.service.TicketBookingMgmtServiceImpl;
import com.nt.vo.TicketBookingDetailsVO;

public class MainController {
	private  ITicketBookingMgmtService service;
	private static Logger logger=Logger.getLogger(MainController.class);
	static {
		try {
			//activate  log4j  by loading its log4j.properties file
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
			logger.debug("Log4j activated");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.fatal("Problem in Log4j activation");
		}
	}//static
	
	public MainController() {
		service= new TicketBookingMgmtServiceImpl();
		logger.info("service class obj is created");
	}
	
	public   String processTicketBooking(TicketBookingDetailsVO vo) throws Exception {
		logger.debug("procecessTicketBooking(-) ");
		//convert VO class object DTO class  objecct
		TicketBookingDetailsDTO dto=new TicketBookingDetailsDTO();
		dto.setCustName(vo.getCustName());
		dto.setSeatNos(vo.getSeatNos());
		dto.setTicketsCount(Integer.parseInt(vo.getTicketsCount()));
		dto.setTicketType(vo.getTicketType());
		logger.debug("VO class obj is converted to DTO class obj");
		//use service
		String result=service.bookTickets(dto);
		logger.info("service class b.method is used");
		return result;
		
	}

}

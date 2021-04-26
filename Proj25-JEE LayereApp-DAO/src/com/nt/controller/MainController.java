package com.nt.controller;

import com.nt.dao.TicketBookingDAOImpl;
import com.nt.dto.TicketBookingDetailsDTO;
import com.nt.service.ITicketBookingMgmtService;
import com.nt.service.TicketBookingMgmtServiceImpl;
import com.nt.vo.TicketBookingDetailsVO;

public class MainController {
	private  ITicketBookingMgmtService service;
	
	public MainController() {
		service= new TicketBookingMgmtServiceImpl();
	}
	
	public   String processTicketBooking(TicketBookingDetailsVO vo) throws Exception {
		//convert VO class object DTO class  objecct
		TicketBookingDetailsDTO dto=new TicketBookingDetailsDTO();
		dto.setCustName(vo.getCustName());
		dto.setSeatNos(vo.getSeatNos());
		dto.setTicketsCount(Integer.parseInt(vo.getTicketsCount()));
		dto.setTicketType(vo.getTicketType());
		//use service
		String result=service.bookTickets(dto);
		return result;
		
	}

}

package com.nt.service;

import com.nt.dto.TicketBookingDetailsDTO;

public interface ITicketBookingMgmtService {
     public String  bookTickets(TicketBookingDetailsDTO dto)throws Exception;
}

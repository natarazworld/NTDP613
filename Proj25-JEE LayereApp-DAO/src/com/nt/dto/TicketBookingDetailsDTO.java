package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class TicketBookingDetailsDTO implements Serializable {
     private String custName;
     private int ticketsCount;
     private  String seatNos;
     private   String ticketType;
     
}

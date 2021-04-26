package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class TicketBookingDetailsBO {
     private String custName;
     private int ticketsCount;
     private  String seatNos;
     private   String ticketType;
     private float billAmount;
     
}

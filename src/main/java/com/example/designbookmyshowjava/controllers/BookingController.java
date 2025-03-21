package com.example.designbookmyshowjava.controllers;

import com.example.designbookmyshowjava.dtos.BookingTicketRequestDTO;
import com.example.designbookmyshowjava.dtos.BookingTicketResponseDTO;
import com.example.designbookmyshowjava.dtos.BookingTicketRequestDTO;
import com.example.designbookmyshowjava.dtos.BookingTicketResponseDTO;
import com.example.designbookmyshowjava.dtos.ResponseStatus;
import com.example.designbookmyshowjava.models.Booking;
import com.example.designbookmyshowjava.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }
    public BookingTicketResponseDTO bookTicket(BookingTicketRequestDTO request){
        BookingTicketResponseDTO response=new BookingTicketResponseDTO();
        try{
           Booking booking= bookingService.bookTicket(request.getUserId(),request.getShowSeatIds(),request.getShowId());
            response.setResponseMessage("Congratulations! You Have Successfully Booked The Ticket !");
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
        }
        catch(Exception e){
          response.setResponseStatus(ResponseStatus.FAILED);
          response.setResponseMessage("Failed To Book The Ticket "+e.getMessage());
        }
        return response;
    }
}

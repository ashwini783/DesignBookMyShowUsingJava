package com.example.designbookmyshowjava.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingTicketResponseDTO {
    private ResponseStatus responseStatus;
    private String ResponseMessage;
    private int bookingId;
    private int amount;
}

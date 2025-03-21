package com.example.designbookmyshowjava.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class BookingTicketRequestDTO {
    private int userId;
    private List<Integer> showSeatIds;
    private int showId;
}

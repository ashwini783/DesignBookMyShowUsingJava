package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Entity
@Setter
@Getter
public class Booking extends BaseModel{
    private int amount;
    private List<Payment>payment;
    private User bookedBy;
    private Date bookingDate;
    private BookingStatus bookingStatus;
    private List<ShowSeat>showSeats;
}

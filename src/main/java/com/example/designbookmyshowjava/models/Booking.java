package com.example.designbookmyshowjava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Entity
@Setter
@Getter
public class Booking extends BaseModel{
    private int amount;
    @OneToMany(mappedBy = "booking") //for bidirectional relationShip
    private List<Payment>payment;
    @ManyToOne
    private User bookedBy;
    private Date bookingDate;
    @Enumerated(value= EnumType.STRING)
    private BookingStatus bookingStatus;
    @OneToMany @JoinColumn(name="booking_id") //to avoid extra table creation
    private List<ShowSeat>showSeats;
}

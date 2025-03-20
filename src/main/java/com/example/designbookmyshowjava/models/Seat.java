package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Seat extends BaseModel {
    private String seatNumber;
    @ManyToOne
    private SeatType seatType;
    private int rowVal;
    private int colVal;

}

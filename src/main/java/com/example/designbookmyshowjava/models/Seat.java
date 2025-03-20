package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Seat extends BaseModel {
    private String seatNumber;
    private SeatType seatType;
    private int row;
    private int col;

}

package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ShowSeatType extends BaseModel{
    private SeatType seatType;
    private Show show;
    private int price;
}

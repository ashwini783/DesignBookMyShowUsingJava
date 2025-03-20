package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private SeatType seatType;
    @ManyToOne
    private Show show;
    private int price;
}

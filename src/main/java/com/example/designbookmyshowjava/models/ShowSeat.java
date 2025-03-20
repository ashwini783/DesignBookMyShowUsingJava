package com.example.designbookmyshowjava.models;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@Setter
@Getter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(value= EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
    private Date bookedAt;

}

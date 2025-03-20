package com.example.designbookmyshowjava.models;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@Setter
@Getter
@Entity
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
    private Date bookedAt;

}

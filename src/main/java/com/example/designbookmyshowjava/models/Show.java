package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Setter
@Getter
@Entity(name="shows")
public class Show extends BaseModel {
    private Movie movie;
    private Date startDate;
    private Theatre theatre;
    private Screen screen;
    private List<ShowSeat>showSeats;
    private List<ShowSeatType>showSeatTypes;
}

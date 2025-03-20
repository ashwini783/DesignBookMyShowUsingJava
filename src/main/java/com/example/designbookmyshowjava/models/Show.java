package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@Entity(name="shows")  //because Show is the keyword in sql so we made it as name='shows'
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;
    private Date startTime;
    private int duration;

    @ManyToOne
    private Screen screen;

    @OneToMany
    private List<ShowSeat> showSeats;

    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}


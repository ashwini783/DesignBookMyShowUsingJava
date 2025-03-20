package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class SeatType extends BaseModel {
   private String seatType;
   private String description;
}

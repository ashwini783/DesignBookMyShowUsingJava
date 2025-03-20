package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    private List<Seat>seats;
    private Theatre theatre;
    private List<Feature>features;
    private int dimn;
}

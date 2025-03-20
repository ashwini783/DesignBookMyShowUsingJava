package com.example.designbookmyshowjava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat>seats;
    @ManyToOne
    private Theatre theatre;
    @Enumerated(value=EnumType.STRING)
    @ElementCollection
    private List<Feature>features;
    private int dimn;
}

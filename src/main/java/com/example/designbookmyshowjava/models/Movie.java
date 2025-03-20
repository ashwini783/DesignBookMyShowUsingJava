package com.example.designbookmyshowjava.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{
     private String title;
     private String director;
     private String year;
     private String genre;
     private Date releaseDate;

     @Enumerated(value=EnumType.STRING)
     @ElementCollection
     private List<Language> language;
     @ElementCollection
     private List<String>actors;
     private double length;
}

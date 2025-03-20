package com.example.designbookmyshowjava.models;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Enabled
public class Movie extends BaseModel{
     private String title;
     private String director;
     private String year;
     private String genre;
     private Date releaseDate;
     private List<Language> language;
     private List<String>actors;
     private double length;
}

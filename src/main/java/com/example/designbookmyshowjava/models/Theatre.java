package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Setter
@Getter
@Entity
public class Theatre extends BaseModel{
    private String theatreName;
//    private List<Screen>screenList;
    private String address;
    private List<Movie>movies;
    private Region region;
}

package com.example.designbookmyshowjava.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class CreateShowRequestDTO {
    private int movieId;
    private int screenId;
    private int duration;
    private Date startTime;
}

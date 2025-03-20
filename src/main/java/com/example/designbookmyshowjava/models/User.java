package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Setter
@Getter
@Entity
public class User extends BaseModel{
 private String email;
 private String password;
 private String firstName;
 private String lastName;
 private String phone;
 private String userName;
 private List<Booking>booking;
}

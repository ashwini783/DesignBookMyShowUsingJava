package com.example.designbookmyshowjava.dtos;

import com.example.designbookmyshowjava.models.Booking;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class SignUpUserRequestDTO {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
}

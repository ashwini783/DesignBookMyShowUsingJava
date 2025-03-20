package com.example.designbookmyshowjava.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDTO {
    private ResponseStatus responseStatus;
    private String responseMessage;
}

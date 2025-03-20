package com.example.designbookmyshowjava.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignUpUserResponseDTO {
    private String responseMessage;
    private ResponseStatus responseStatus;
    private int userId;
}

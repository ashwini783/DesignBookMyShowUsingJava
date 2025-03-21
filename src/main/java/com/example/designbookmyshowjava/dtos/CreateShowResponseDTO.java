package com.example.designbookmyshowjava.dtos;

import com.example.designbookmyshowjava.models.Show;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateShowResponseDTO {
    private ResponseStatus responseStatus;
    private Show show;
}

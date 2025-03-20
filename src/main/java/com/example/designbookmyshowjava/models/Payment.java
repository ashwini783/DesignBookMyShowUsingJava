package com.example.designbookmyshowjava.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private String refNumber;
    private Date paymentDate;
    private int amount;
    @Enumerated(value= EnumType.STRING)
    private PaymentMode paymentMode;
    @Enumerated(value= EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(value= EnumType.STRING)
    private PaymentGateway paymentGateway;
    @ManyToOne
    private Booking booking;
}

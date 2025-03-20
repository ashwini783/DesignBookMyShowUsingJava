package com.example.designbookmyshowjava.models;
import jakarta.persistence.Entity;
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
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private PaymentGateway paymentGateway;
    private Booking booking;
}

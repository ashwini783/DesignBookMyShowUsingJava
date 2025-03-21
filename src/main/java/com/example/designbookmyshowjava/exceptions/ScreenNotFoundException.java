package com.example.designbookmyshowjava.exceptions;

import org.aspectj.bridge.IMessage;

public class ScreenNotFoundException extends Exception{
    public ScreenNotFoundException(String message){
        super(message);
    }
}

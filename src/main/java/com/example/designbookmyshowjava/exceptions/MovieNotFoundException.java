package com.example.designbookmyshowjava.exceptions;

import com.example.designbookmyshowjava.repositories.MovieRepository;

public class MovieNotFoundException extends  Exception{
     public MovieNotFoundException(String message){
         super(message);
     }
}

package com.example.designbookmyshowjava;

import com.example.designbookmyshowjava.controllers.UserController;
import com.example.designbookmyshowjava.dtos.*;
import com.example.designbookmyshowjava.models.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DesignBookMyShowJavaApplication implements CommandLineRunner {
    @Autowired
   UserController userController;
    public static void main(String[] args) {
        SpringApplication.run(DesignBookMyShowJavaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        //1. Register User
        SignUpUserRequestDTO userRequest=new SignUpUserRequestDTO();
        userRequest.setFirstName("Jon");
        userRequest.setLastName("JJ");
        userRequest.setEmail("Jon@gmail.com");
        userRequest.setPhone("9862252345");
        userRequest.setPassword("sonalp");

//        SignUpUserResponseDTO userResponse=userController.signUpUser(userRequest);
//        if(userResponse.getResponseStatus().equals(ResponseStatus.SUCCESS)){
//            System.out.println("Congratulations! "+userResponse.getResponseMessage() +" And UserID Is: "+userResponse.getUserId());
//        }
//        else{
//            System.out.println("Unable To Register User Due To : "+userResponse.getResponseMessage());
//        }

        //2. Login User
        LoginRequestDTO loginRequest=new LoginRequestDTO();
        loginRequest.setEmail("ash@gmail.com");
        loginRequest.setPassword("Ashuu");
        LoginResponseDTO loginResponse= userController.login(loginRequest);
        if(loginResponse.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println(loginResponse.getResponseMessage());
        }
        else{
            System.out.println("Unable To Logged In User Due To "+loginResponse.getResponseMessage());
        }

    }
}

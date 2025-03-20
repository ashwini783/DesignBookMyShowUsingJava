package com.example.designbookmyshowjava.controllers;

import com.example.designbookmyshowjava.dtos.*;
import com.example.designbookmyshowjava.models.User;
import com.example.designbookmyshowjava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    UserService userService;
    @Autowired
    UserController(UserService userService){
        this.userService=userService;
    }
    public SignUpUserResponseDTO signUpUser(SignUpUserRequestDTO request){
        SignUpUserResponseDTO response=new SignUpUserResponseDTO();
         try{
             User user= userService.signUpUser(request.getFirstName(),request.getLastName(),request.getEmail(),request.getPhone(),request.getPassword());
              response.setResponseMessage("User Registered Successfully");
              response.setResponseStatus(ResponseStatus.SUCCESS);
              response.setUserId(user.getId());
         } catch (Exception e) {
              response.setResponseMessage(e.getMessage());
              response.setResponseStatus(ResponseStatus.FAILED);
         }
        return response;
    }

    public LoginResponseDTO login(LoginRequestDTO request){
        LoginResponseDTO response=new LoginResponseDTO();
        try{
            userService.login(request.getEmail(),request.getPassword());
            response.setResponseMessage("User Logged In Successfully!");
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch (Exception e){
           response.setResponseStatus(ResponseStatus.FAILED);
           response.setResponseMessage(e.getMessage());
        }
        return response;
    }
}

package com.example.designbookmyshowjava.services;

import com.example.designbookmyshowjava.exceptions.IncorrectPasswordException;
import com.example.designbookmyshowjava.exceptions.UserNotFoundException;
import com.example.designbookmyshowjava.models.User;
import com.example.designbookmyshowjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
     UserRepository userRepository;


     @Autowired
     UserService(UserRepository userRepository){
         this.userRepository=userRepository;
     }
    public User signUpUser(String fName,String lName,String email,String phone,String password) throws Exception {
        Optional<User>userOptional=userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new Exception("User Already Exist");
        }
        User user=new User();
        user=new User();
        user.setFirstName(fName);
        user.setLastName(lName);
        user.setEmail(email);
        user.setUserName(email);
        user.setPhone(phone);
        user.setPassword(password);
        user.setBooking(new ArrayList<>());
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        return userRepository.save(user);
    }
    public void login(String email,String password) throws Exception {
         Optional<User>userOptional=userRepository.findByEmail(email);
         if(userOptional.isEmpty()){
             throw new UserNotFoundException("User Not Found");
         }
         User user=userOptional.get();
         if(!Objects.equals(user.getPassword(), password)){
             throw new IncorrectPasswordException("Incorrect Password, Please Enter A Valid Password");
         }
//         return user.getPassword()==password;
    }
}

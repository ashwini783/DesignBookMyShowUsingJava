package com.example.designbookmyshowjava;

import com.example.designbookmyshowjava.controllers.BookingController;
import com.example.designbookmyshowjava.controllers.CreateShowController;
import com.example.designbookmyshowjava.controllers.UserController;
import com.example.designbookmyshowjava.dtos.*;
import com.example.designbookmyshowjava.models.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class DesignBookMyShowJavaApplication implements CommandLineRunner {
    @Autowired
   UserController userController;
    @Autowired
    BookingController bookingController;
    @Autowired
    CreateShowController createShowController;
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
//        LoginResponseDTO loginResponse= userController.login(loginRequest);
//        if(loginResponse.getResponseStatus().equals(ResponseStatus.SUCCESS)){
//            System.out.println(loginResponse.getResponseMessage());
//        }
//        else{
//            System.out.println("Unable To Logged In User Due To "+loginResponse.getResponseMessage());
//        }

//        3. Booking Service
        BookingTicketRequestDTO bookingRequest=new BookingTicketRequestDTO();
            bookingRequest.setUserId(1);
            bookingRequest.setShowId(12);
            bookingRequest.setShowSeatIds(new ArrayList<>());
//         BookingTicketResponseDTO bookResponse  = bookingController.bookTicket(bookingRequest);
//         if(bookResponse.getResponseStatus().equals(ResponseStatus.SUCCESS)){
//             System.out.println(bookResponse.getResponseMessage());
//         }
//         else{
//             System.out.println(bookResponse.getResponseMessage());
//         }

//        4. Create Show
//        private int movieId;
//        private int screenId;
//        private int duration;
//        private Date startTime;
        CreateShowRequestDTO createShowRequest=new CreateShowRequestDTO();
        createShowRequest.setMovieId(122);
        createShowRequest.setScreenId(11);
        createShowRequest.setDuration(3);
        createShowRequest.setStartTime(new Date(04,04,25));
        CreateShowResponseDTO createShowResponse=createShowController.createShow(createShowRequest);

        if(createShowResponse.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Show Created Successfully And This Is Your Show Id "+createShowResponse.getShow().getId());
        }
        else{
            System.out.println("Failed To Create Show "+createShowResponse.getResponseStatus());
        }
    }
}

package com.example.designbookmyshowjava.services;

import com.example.designbookmyshowjava.exceptions.ShowNotFoundException;
import com.example.designbookmyshowjava.exceptions.UserNotFoundException;
import com.example.designbookmyshowjava.models.*;
import com.example.designbookmyshowjava.repositories.BookingRepository;
import com.example.designbookmyshowjava.repositories.ShowRepository;
import com.example.designbookmyshowjava.repositories.ShowSeatRepository;
import com.example.designbookmyshowjava.repositories.UserRepository;
import jakarta.persistence.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class BookingService {
  UserRepository userRepository;
  ShowRepository showRepository;
  ShowSeatRepository showSeatRepository;
  BookingRepository bookingRepository;
  public BookingService(UserRepository userRepository,ShowRepository showRepository,ShowSeatRepository showSeatRepository,BookingRepository bookingRepository){
      this.userRepository=userRepository;
      this.showRepository=showRepository;
      this.showSeatRepository=showSeatRepository;
      this.bookingRepository=bookingRepository;
  }
  @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(int userId, List<Integer> showSeatIds, int showId) throws UserNotFoundException, ShowNotFoundException {
      Booking booking =new Booking();
        Optional<User>userOptional=userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new UserNotFoundException("User Not Found, Please Register First To Book Your Ticket..Thank You!");
        }
        User user=userOptional.get();
        Optional<Show>showOptional=showRepository.findById(showId);
        if(showOptional.isEmpty()){
           throw new ShowNotFoundException("Show Not Found");
        }
        Show show=showOptional.get();
        List<ShowSeat> showSeats=showSeatRepository.findAllById(showSeatIds);

        for(ShowSeat showSeat:showSeats){
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new RuntimeException("Selected Show Sets are not available");
            }
        }

        for(ShowSeat showSeat:showSeats){
             showSeat.setShowSeatStatus(ShowSeatStatus.BOOKED);
             showSeat.setBookedAt(new Date());
        }
        showSeatRepository.saveAll(showSeats);
        booking.setBookedBy(user);
        booking.setBookingDate(new Date());
        booking.setBookingStatus(BookingStatus.SUCCESSFUL);
        booking.setShowSeats(showSeats);
        return bookingRepository.save(booking);
    }
}

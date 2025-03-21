package com.example.designbookmyshowjava.repositories;

import com.example.designbookmyshowjava.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
    public Booking save(Booking booking);
}

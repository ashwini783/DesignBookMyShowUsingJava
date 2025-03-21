package com.example.designbookmyshowjava.repositories;

import com.example.designbookmyshowjava.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ShowRepository extends JpaRepository<Show,Integer> {
    public Optional<Show> findById(int showId);
    public Show save(Show show);
}

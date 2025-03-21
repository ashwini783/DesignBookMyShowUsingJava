package com.example.designbookmyshowjava.repositories;

import com.example.designbookmyshowjava.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    public Optional<Movie> findById(int movieId);
}

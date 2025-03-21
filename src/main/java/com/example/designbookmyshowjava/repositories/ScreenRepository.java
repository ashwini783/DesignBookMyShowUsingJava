package com.example.designbookmyshowjava.repositories;

import com.example.designbookmyshowjava.models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Integer> {
   public Optional<Screen> findById(int screenId);
}

package com.example.designbookmyshowjava.repositories;

import com.example.designbookmyshowjava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public Optional<User> findByEmail(String email);

    public User save(User user);
}

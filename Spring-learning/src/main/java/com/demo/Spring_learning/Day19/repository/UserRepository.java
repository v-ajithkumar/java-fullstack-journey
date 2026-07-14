package com.demo.Spring_learning.Day19.repository;

import com.demo.Spring_learning.Day19.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
}

package com.example.myboard.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myboard.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

package com.example.challanges.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.challanges.domain.User;

public interface UserRepo extends JpaRepository<User, Long>{
	User findByUsername(String username);
}

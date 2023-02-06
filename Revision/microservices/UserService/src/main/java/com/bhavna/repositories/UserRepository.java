package com.bhavna.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}

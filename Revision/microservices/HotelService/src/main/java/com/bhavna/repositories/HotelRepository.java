package com.bhavna.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}

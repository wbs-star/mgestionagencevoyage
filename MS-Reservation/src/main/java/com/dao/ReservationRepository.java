package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}

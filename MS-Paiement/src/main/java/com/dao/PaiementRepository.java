package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Integer> {

}

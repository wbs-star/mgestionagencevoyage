package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Paiement {
	@Id @GeneratedValue
	private Integer id;
	private Integer idReservation;
	private Integer montant;
	private Long numeroCarte;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(Integer montant) {
		this.montant = montant;
	}
	public Long getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(Long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public Paiement(Integer idReservation, Integer montant, Long numeroCarte) {
		super();
		this.idReservation = idReservation;
		this.montant = montant;
		this.numeroCarte = numeroCarte;
	}
	public Paiement() {
		super();
	}
	@Override
	public String toString() {
		return "Paiement [id=" + id + ", idReservation=" + idReservation + ", montant=" + montant + ", numeroCarte="
				+ numeroCarte + "]";
	}

	
}

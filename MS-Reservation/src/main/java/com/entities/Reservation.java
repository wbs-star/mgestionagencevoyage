package com.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Reservation implements Serializable{

	@Id @GeneratedValue
	private Integer id;
	private Integer vol;
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	private Integer quantité;
	private Boolean reservationPayee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVol() {
		return vol;
	}
	public void setVol(Integer vol) {
		this.vol = vol;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public Integer getQuantité() {
		return quantité;
	}
	public void setQuantité(Integer quantité) {
		this.quantité = quantité;
	}
	public Boolean getReservationPayee() {
		return reservationPayee;
	}
	public void setReservationPayee(Boolean reservationPayee) {
		this.reservationPayee = reservationPayee;
	}
	public Reservation(Integer vol, Date dateReservation, Integer quantité, Boolean reservationPayee) {
		super();
		this.vol = vol;
		this.dateReservation = dateReservation;
		this.quantité = quantité;
		this.reservationPayee = reservationPayee;
	}
	public Reservation() {
		super();
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", vol=" + vol + ", dateReservation=" + dateReservation + ", quantité="
				+ quantité + ", reservationPayee=" + reservationPayee + "]";
	}
	
	

	
}

package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dao.ReservationRepository;
import com.entities.Reservation;


@SpringBootApplication
public class MsReservationApplication implements CommandLineRunner {
	
	@Autowired
	private ReservationRepository res;

	public static void main(String[] args) {
		SpringApplication.run(MsReservationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		res.save(new Reservation(408,df.parse("12/01/2020"),2,true));
		res.save(new Reservation(9077,df.parse("28/09/2020"),5,true));

		res.findAll().forEach(c->{System.out.println(c.getVol());});
		
		System.out.println("l'application a bien fonctionné");
	}

}

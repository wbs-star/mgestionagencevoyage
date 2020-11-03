package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dao.PaiementRepository;
import com.entities.Paiement;


@SpringBootApplication
public class MsPaiementApplication implements CommandLineRunner{
	@Autowired
	private PaiementRepository pai;
	
	public static void main(String[] args) {
		SpringApplication.run(MsPaiementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		pai.save(new Paiement(6566546,388,(long) 866363));
		pai.save(new Paiement(8962896,499,(long) 646688));

		pai.findAll().forEach(c->{System.out.println(c.getIdReservation());});
		
		System.out.println("l'application a bien fonctionné");
	}

}

package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dao.VolRepository;
import com.entities.Vol;

@SpringBootApplication
public class MsVolApplication implements CommandLineRunner{
	
	@Autowired
	private VolRepository volrepo;

	public static void main(String[] args) {
		SpringApplication.run(MsVolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		volrepo.save(new Vol("Madrid-Pretoria","Vol Direct","SAfrica.jpeg",999.99));
		volrepo.save(new Vol("Brazilia-Toronto","Vol Direct","Canada.jpeg",547.99));

		volrepo.findAll().forEach(c->{System.out.println(c.getTitre());});
		
		System.out.println("l'application a bien fonctionné");
	}

}

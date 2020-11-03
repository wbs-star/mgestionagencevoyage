package com.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ReservationRepository;
import com.entities.Reservation;


@RestController
@CrossOrigin("*")
public class ReservationRestService {

	@Autowired
	private ReservationRepository res;
	
	@RequestMapping(value="/reservation",method=RequestMethod.GET)
	public List<Reservation> RechercheTousCont(){
		return res.findAll();
	}


	@RequestMapping(value="/reservation/{id}",method=RequestMethod.GET)
	public Optional<Reservation>  RechercheUnCont(@PathVariable Integer id){
		return res.findById(id);
	}
	
	@RequestMapping(value="/reservation",method=RequestMethod.POST)
	public Reservation Enregistrer(@RequestBody Reservation c){
		return res.save(c);
	}
	
	@RequestMapping(value="/reservation{id}",method=RequestMethod.DELETE)
	public boolean Supprimer(@PathVariable Integer id){
		res.deleteById(id);
		 return true;
	}
	
	@RequestMapping(value="/reservation{id}",method=RequestMethod.PUT)
	public Reservation Enregistrer(@PathVariable Integer id,@RequestBody Reservation c){
		c.setId(id);
		return res.save(c);
	}
	
	
	
	
	
	
	
}

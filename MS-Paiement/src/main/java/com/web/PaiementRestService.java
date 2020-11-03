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

import com.dao.PaiementRepository;
import com.entities.Paiement;


@RestController
@CrossOrigin("*")
public class PaiementRestService {

	@Autowired
	private PaiementRepository pai;
	
	@RequestMapping(value="/paiement",method=RequestMethod.GET)
	public List<Paiement> RechercheTousCont(){
		return pai.findAll();
	}


	@RequestMapping(value="/paiement/{id}",method=RequestMethod.GET)
	public Optional<Paiement>  RechercheUnCont(@PathVariable Integer id){
		return pai.findById(id);
	}
	
	@RequestMapping(value="/paiement",method=RequestMethod.POST)
	public Paiement Enregistrer(@RequestBody Paiement c){
		return pai.save(c);
	}
	
	@RequestMapping(value="/paiement{id}",method=RequestMethod.DELETE)
	public boolean Supprimer(@PathVariable Integer id){
		pai.deleteById(id);
		 return true;
	}
	
	@RequestMapping(value="/paiement{id}",method=RequestMethod.PUT)
	public Paiement Enregistrer(@PathVariable Integer id,@RequestBody Paiement c){
		c.setId(id);
		return pai.save(c);
	}
}

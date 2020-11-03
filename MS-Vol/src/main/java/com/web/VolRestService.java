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

import com.dao.VolRepository;

import com.entities.Vol;

@RestController
@CrossOrigin("*")
public class VolRestService {

	@Autowired
	private VolRepository volrep;
	
	@RequestMapping(value="/vol",method=RequestMethod.GET)
	public List<Vol> RechercheTousCont(){
		return volrep.findAll();
	}


	@RequestMapping(value="/vol/{id}",method=RequestMethod.GET)
	public Optional<Vol>  RechercheUnCont(@PathVariable Integer id){
		return volrep.findById(id);
	}
	
	@RequestMapping(value="/vol",method=RequestMethod.POST)
	public Vol Enregistrer(@RequestBody Vol c){
		return volrep.save(c);
	}
	
	@RequestMapping(value="/vol{id}",method=RequestMethod.DELETE)
	public boolean Supprimer(@PathVariable Integer id){
		volrep.deleteById(id);
		 return true;
	}
	
	@RequestMapping(value="/vol{id}",method=RequestMethod.PUT)
	public Vol Enregistrer(@PathVariable Integer id,@RequestBody Vol c){
		c.setId(id);
		return volrep.save(c);
	}
}

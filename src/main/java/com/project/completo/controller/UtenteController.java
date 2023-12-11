package com.project.completo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.completo.entity.Utente;
import com.project.completo.service.UtenteService;

@CrossOrigin(origins = "*")
@RestController
public class UtenteController {

	@Autowired
	UtenteService utenteservice;
	
	public UtenteController(UtenteService utenteservice) {
		super();
		this.utenteservice = utenteservice;
	}
	
	@GetMapping("/utenti")
	public Iterable<Utente> listaUtenti() {
		//System.out.println("prova");
		
		return utenteservice.getTuttiutenti();
	}
	
	@DeleteMapping("/cancellaUtente/{id}")
	public void cancellaUtente(@PathVariable Integer id) {
		utenteservice.cancellaUtenteById(id);
	}

	@PostMapping("/utenti/nuovo")
	public Utente creaUtente(@RequestBody(required=true)Utente nuovoUtente) {
		nuovoUtente=utenteservice.nuovoUtente(nuovoUtente);
		return nuovoUtente;
		
	}
	
	//modifica utente

}

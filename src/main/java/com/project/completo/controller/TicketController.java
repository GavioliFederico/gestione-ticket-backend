package com.project.completo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.completo.entity.Ticket;
import com.project.completo.entity.TicketRequest;
import com.project.completo.entity.Utente;
import com.project.completo.service.TicketService;
import com.project.completo.service.UtenteService;

@CrossOrigin(origins = "*")
@RestController
public class TicketController {

	@Autowired
	private TicketService ticketservice;
	
	@Autowired
	private UtenteService utenteservice;
	
    public TicketController(TicketService ticketService, UtenteService utenteService) {
        this.ticketservice = ticketService;
    }

	@GetMapping("/ticket")
	public Iterable<Ticket> getTicket(){
		return ticketservice.getTuttiTicket();
	}
	
	
	@PostMapping("/ticket/nuovo/{idUtente}")
	public ResponseEntity<Ticket> creaTicket(@RequestBody TicketRequest ticketRequest, @PathVariable(name = "idUtente") int idUtente) {
	//public Ticket creaTicket(@RequestBody TicketRequest ticketRequest, @PathVariable(name = "idUtente") int idUtente) {
	    // Retrieve the user (Utente) based on the provided idUtente
	    Optional<Utente> utente = utenteservice.getUtente(idUtente);
	
	    // Create a new Ticket object using only the relevant fields from the request
	    Ticket nuovoTicket = new Ticket();
	    nuovoTicket.setDescrizione(ticketRequest.getDescrizione());
	    nuovoTicket.setData_inserimento(ticketRequest.getData_inserimento());
	    nuovoTicket.setTipologia(ticketRequest.getTipologia());

	    nuovoTicket.setUtente(utente.orElseThrow()); // Assuming the user is present
	    System.out.println(nuovoTicket);
	
	
	    Ticket createdTicket = ticketservice.nuovoTicket(nuovoTicket);
	    System.out.println(createdTicket);
	    return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
	}
}

package com.project.completo.service;

import java.util.List;

import com.project.completo.entity.Ticket;
import java.util.Optional;

public interface TicketService {

	List<Ticket> getTuttiTicket();
	
	Ticket nuovoTicket(Ticket nuovoTicket);
	
	Optional<Ticket> getTicketById(Integer ticketId);
	
}

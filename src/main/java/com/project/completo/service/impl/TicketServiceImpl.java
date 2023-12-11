package com.project.completo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.completo.entity.Ticket;
import com.project.completo.repository.TicketRepository;
import com.project.completo.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	
	private TicketRepository ticketrepository;

	public TicketServiceImpl(TicketRepository ticketrepository) {
		super();
		this.ticketrepository = ticketrepository;
	}

	@Override
	public List<Ticket> getTuttiTicket() {
		return ticketrepository.findAll();
	}

	@Override
	public Ticket nuovoTicket(Ticket nuovoTicket) {
		return ticketrepository.save(nuovoTicket);
	}

	@Override
	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketrepository.findById(ticketId);
	}



}

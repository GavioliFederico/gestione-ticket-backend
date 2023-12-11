package com.project.completo.service;

import java.util.List;
import java.util.Optional;

import com.project.completo.entity.Utente;

public interface UtenteService {

	List<Utente> getTuttiutenti();
	
	void cancellaUtenteById(Integer id);
	
	Utente nuovoUtente(Utente nuovoUtente);
	
	Utente modificaUtente(Utente utenteModificato);
	
	Optional<Utente> getUtente(Integer Id);

	
}

package com.project.completo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.completo.entity.Utente;
import com.project.completo.repository.UtenteRepository;
import com.project.completo.service.UtenteService;

@Service
public class UtenteServiceImpl implements UtenteService{
	
	private UtenteRepository utenterepository;

	public UtenteServiceImpl(UtenteRepository utenterepository) {
		super();
		this.utenterepository = utenterepository;
	}


	@Override
	public List<Utente> getTuttiutenti() {
		return utenterepository.findAll();
	}


	@Override
	public void cancellaUtenteById(Integer id) {
		utenterepository.deleteById(id);
	}

	@Override
	public Utente nuovoUtente(Utente nuovoUtente) {
		return utenterepository.save(nuovoUtente);
	}
	
	@Override
	public Optional<Utente> getUtente(Integer Id) {
		return utenterepository.findById(Id);
	}

	///////////////////////////////////////////////////
	
	@Override
	public Utente modificaUtente(Utente utenteModificato) {
		return utenterepository.save(utenteModificato);
	}





}

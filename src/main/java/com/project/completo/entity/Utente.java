package com.project.completo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Utente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotNull
	private int id;
	
	////////////////Chiave Esterna//////////////////
	
	@OneToMany(mappedBy="utente")
	@JsonBackReference
	private List<Ticket> ticket;
	
	///////////////////////////////////////////////
		
    @NotBlank
    @Size(max = 20)
	private String nome;
    
    @NotBlank
    @Size(max = 20)
	private String cognome;
    
    @NotBlank
	private String email;
    
    @NotBlank
    @Size(min = 8, max = 20)
	private String password;
    
    @NotBlank
	private String ruolo;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public Utente(String nome, String cognome, String email, String password, String ruolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.ruolo = ruolo;
	}
    
	public Utente() {
		super();
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", ruolo=" + ruolo + "]";
	}
    
    
	
}

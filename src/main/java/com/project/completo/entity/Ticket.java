package com.project.completo.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotNull
	private int id;
	
	////////////////Chiave Esterna//////////////////
	
	@ManyToOne
	@JoinColumn(name="utente_id",nullable=false)
	private Utente utente;
	
	
	///////////////////////////////////////////////
	
	
    @NotBlank
	private String descrizione;
    
	@NotNull
	private Date data_inserimento;
    
	private Date data_chiusura;
    
    @NotBlank
    @Size(max = 70)
	private String tipologia;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getData_inserimento() {
		return data_inserimento;
	}

	public void setData_inserimento(Date data_inserimento) {
		this.data_inserimento = data_inserimento;
	}

	public Date getData_chiusura() {
		return data_chiusura;
	}

	public void setData_chiusura(Date data_chiusura) {
		this.data_chiusura = data_chiusura;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}


	
    public Ticket(Utente utente, String descrizione, Date data_inserimento,
			Date data_chiusura, String tipologia) {
		super();
		this.utente = utente;
		this.descrizione = descrizione;
		this.data_inserimento = data_inserimento;
		this.data_chiusura = data_chiusura;
		this.tipologia = tipologia;
	}

	public Ticket() {
		super();
	}

	@Override
	public String toString() {
		return "Ticket [data_inserimento=" + data_inserimento + ", tipologia=" + tipologia + "]";
	}
	
}

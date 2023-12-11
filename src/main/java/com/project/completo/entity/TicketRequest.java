package com.project.completo.entity;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TicketRequest {
    @NotBlank
    private String descrizione;

    @NotNull
    private Date data_inserimento;

    @NotBlank
    @Size(max = 70)
    private String tipologia;

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

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return "TicketRequest [descrizione=" + descrizione + ", tipologia=" + tipologia + "]";
	}

	
    
}

package com.mariaf.dsevento.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AvaliacaoPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5588998924984266936L;

	@ManyToOne
	@JoinColumn(name="evento_id")
	private Evento evento;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Participante participante;
	
	public AvaliacaoPK() {
		
	}

	public Movie getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public User getParticipante() {
		return participante;
	}

	public void setUser(Participante participante) {
		this.participante = participante;
	}
	
	
}
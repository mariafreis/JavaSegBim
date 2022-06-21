package br.com.mariaf.Evento.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class EventoDTO {
    private long id;
    private String nome;
    private double avaliacao;
    private String participantes;
}
 
 public EventoDTO() {
		
	}

	public EventoDTO(Long id, String nome) {
	
		this.id = id;
		this.nome = nome;
	}
	
	public EventoDTO(Evento evento) {
	
		this.id = evento.getId();
		this.nome = evento.getNome();
		this.avaliacao = evento.getAvaliacao();
		this.participantes = evento.getParticipantes();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}


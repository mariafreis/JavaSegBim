package br.com.mariaf.ParticipanteDto;

import lombok.Data;

import java.util.Date;

@Data
public class ParticipanteDTO {
    private long id;
    private String nome;
    private String email;
}
public ParticipanteDTO() {
		
	}

	public Long getEventoId() {
		return eventoId;
	}

	public void setEventoId(Long eventoId) {
		this.eventoId = eventoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setScore(String email) {
		this.email = email;
	}
	
	
}

package br.com.mariaf.Avaliacoes.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class AvaliacaoDTO {
    private long id;
    private Date data_avaliacao;
    private Float value;
}
public AvaliacaoDTO() {
		
	}

	public Long getEventoId() {
		return eventoId;
	}

	public void setEventoId(Long eventoId) {
		this.eventoId = eventoId;
	}

	public Data getdata_avaliacao() {
		return data_avaliacao;
	}

	public void setEmail(Date data_avaliacao) {
		this.data_avaliacao = data_avaliacao;
	}

	public Float getValue() {
		return score;
	}

	public void setScore(Float value) {
		this.value = value;
	}
	
	
}
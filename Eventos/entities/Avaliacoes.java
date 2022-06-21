package br.com.mariaf.Avaliacoes.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Table(name = "avaliacoes")
@Entity
public class Avaliacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date data_avaliacao;
    private Float value;


    @OneToMany(mappedBy = "id")
    private Set<Avaliacoes> avaliacoes = new HashSet<>();
}

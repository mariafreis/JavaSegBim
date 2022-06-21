package br.com.mariaf.Avaliacoes.Repository;

import br.com.gustavo.Avaliacoes.entities.Avaliacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAvaliacoesRepository extends JpaRepository<Avaliacoes, Long> {

}

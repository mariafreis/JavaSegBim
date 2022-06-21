package br.com.mariaf.Participante.Repository;

import br.com.mariaf.Avaliacoes.entities.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParticipanteRepository extends JpaRepository<Participante, Long> {
}

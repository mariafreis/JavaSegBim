package br.com.mariaf.Evento.Repository;

import br.com.gustavo.Evento.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoRepository extends JpaRepository<Evento, Long> {
}

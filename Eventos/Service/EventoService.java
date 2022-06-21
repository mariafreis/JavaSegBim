package br.com.mariaf.Evento.Service;

import br.com.gustavo.Evento.Dto.AvaliacaoDTO;
import br.com.gustavo.Evento.Repository.IEventoRepository;
import br.com.gustavo.Evento.entities.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EventoService {
    @Autowired
    IEventoRepository repository;

    @Transactional
    public Page<AvaliacaoDTO> findAll(Pageable pageable){
        Page<Evento> Evento = repository.findAll(pageable);
        Page<AvaliacaoDTO> retonro = Evento.map(x -> new AvaliacaoDTO());
        return retorno;
    }
    @Transactional
    public Optional<Evento> findById(Long id){
        Optional<Evento> evento = repository.findById(id);
        if (!evento.isPresent()){
            return null;
        }
        return evento;
    }

    @Transactional
    public Evento post(Evento evento){
        return repository.save(evento);
    }

    @Transactional
    public Evento update(Evento evento){
        Optional<Evento> even = repository.findById(evento.getId());
        if (even.isPresent() != true) {
            return null;
        }
        Evento element = repository.save(evento);
        return element;
    }

    @Transactional
    public String delete(Long id){
        Optional<Evento> even = repository.findById(id);
        if (even.isPresent() != true){
            return "nada a deletar";
        }
        Evento eve = repository.getById(id);
        repository.delete(eve);
        return "deletado com sucesso";
    }
}

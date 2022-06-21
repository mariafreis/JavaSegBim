package br.com.mariaf.Participante.Service;

import br.com.gustavo.Participante.Dto.AvaliacaoDTO;
import br.com.gustavo.Participante.Repository.IParticipanteRepository;
import br.com.gustavo.Participante.entities.Participante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ParticipanteService {
    @Autowired
    IParticipanteRepository repository;

    @Transactional
    public Page<AvaliacaoDTO> findAll(Pageable pageable){
        Page<Participante> Participante = repository.findAll(pageable);
        Page<AvaliacaoDTO> retorno = Participante.map(x -> new AvaliacaoDTO());
        return retorno;
    }
    @Transactional
    public Optional<Participante> findById(Long id){
        Optional<Participante> Participante = repository.findById(id);
        if (!Participante.isPresent()){
            return null;
        }
        return Participante;
    }

    @Transactional
    public Participante post(Participante participante){
        return repository.save(Participante);
    }

    @Transactional
    public Participante update(Participante participante){
        Optional<Participante> par = repository.findById(Participante.getId());
        if (par.isPresent() != true) {
            return null;
        }
        Participante element = repository.save(participante);
        return element;
    }

    @Transactional
    public String delete(Long id){
        Optional<Participante> par = repository.findById(id);
        if (par.isPresent() != true){
            return "nada a deletar";
        }
        Participante part = repository.getById(id);
        repository.delete(part);
        return "deletado com sucesso";
    }
}

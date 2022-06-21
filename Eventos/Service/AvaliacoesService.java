package br.com.mariaf.Avaliacoes.Service;

import br.com.gustavo.Avaliacoes.Dto.AvaliacaoDTO;
import br.com.gustavo.Avaliacoes.Repository.IAvaliacoesRepository;
import br.com.gustavo.Avaliacoes.entities.Avaliacoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class AvaliacoesService {
    @Autowired
    IAvaliacoesRepository repository;

    @Transactional
    public Page<AvaliacaoDTO> findAll(Pageable pageable){
        Page<Avaliacoes> avaliacoes = repository.findAll(pageable);
        Page<AvaliacaoDTO> retorno = avaliacoes.map(x -> new AvaliacaoDTO());
        return retorno;
    }
    @Transactional
    public Optional<Avaliacoes> findById(Long id){
        Optional<Avaliacoes> avaliacao = repository.findById(id);
        if (!avaliacao.isPresent()){
            return null;
        }
        return avaliacao;
    }

    @Transactional
    public Avaliacoes post(Avaliacoes avaliacao){
        return repository.save(avaliacao);
    }

    @Transactional
    public Avaliacoes update(Avaliacoes avaliacao){
        Optional<Avaliacoes> ava = repository.findById(avaliacao.getId());
        if (ava.isPresent() != true) {
            return null;
        }
        Avaliacoes element = repository.save(avaliacao);
        return element;
    }

    @Transactional
    public String delete(Long id){
        Optional<Avaliacoes> ava = repository.findById(id);
        if (ava.isPresent() != true){
            return "nada a deletar";
        }
        Avaliacoes aval = repository.getById(id);
        repository.delete(aval);
        return "deletado com sucesso";
    }
}

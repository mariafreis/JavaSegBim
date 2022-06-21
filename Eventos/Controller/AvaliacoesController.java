package br.com.mariaf.Avaliacoes.Controller;

import br.com.mariaf.Avaliacoes.Dto.AvaliacaoDTO;
import br.com.mariaf.Avaliacoes.Service.AvaliacoesService;
import br.com.mariaf.Avaliacoes.entities.Avaliacoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.Optional;

@RestController
@RequestMapping(value = "avaliacoes")
public class AvaliacoesController {
    @Autowired
    AvaliacoesService service;

    @GetMapping
    public Page<AvaliacaoDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping(path = "/{id")
    public Optional<Avaliacoes> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping(path = "/")
    public Avaliacoes post(@RequestBody Avaliacoes avaliacao){
        return service.post(avaliacao);
    }

    @PutMapping(path = "/{id}")
    public Avaliacoes update(@RequestBody Avaliacoes avaliacao){
        return service.update(avaliacao);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }
}

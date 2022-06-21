package br.com.mariaf.participante.controller;

import br.com.mariaf.participante.Dto.eventoDTO;
import br.com.mariaf.participante.Service.participanteService;
import br.com.mariaf.participante.entities.participante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.Optional;

@RestController
@RequestMapping(value = "participante")
public class participanteController {
    @Autowired
    participanteService service;

    @GetMapping
    public Page<eventoDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping(path = "/{id")
    public Optional<participante> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping(path = "/")
    public participante post(@RequestBody Participante participante){
        return service.post(evento);
    }

    @PutMapping(path = "/{id}")
    public participante update(@RequestBody Participante participante){
        return service.update(evento);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }
}

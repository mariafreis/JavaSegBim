package br.com.mariaf.eventos.controller;

import br.com.mariaf.eventos.Dto.eventoDTO;
import br.com.mariaf.eventos.Service.eventosService;
import br.com.mariaf.eventos.entities.eventos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.Optional;

@RestController
@RequestMapping(value = "Eventos")
public class eventosController {
    @Autowired
    eventosService service;

    @GetMapping
    public Page<eventoDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping(path = "/{id}")
    public Optional<eventos> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping(path = "/")
    public eventos post(@RequestBody eventos evento){
        return service.post(evento);
    }

    @PutMapping(path = "/{id}")
    public eventos update(@RequestBody eventos evento){
        return service.update(evento);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }
}

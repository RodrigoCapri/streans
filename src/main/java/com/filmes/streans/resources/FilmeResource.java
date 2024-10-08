package com.filmes.streans.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmes.streans.documents.Filme;
import com.filmes.streans.services.FilmeServiceMongoDB;

@RestController
@RequestMapping(value = "/filmes")
public class FilmeResource {
    
    @Autowired
    private FilmeServiceMongoDB service;

    @GetMapping
    public ResponseEntity< List<Filme> > findAll() {

        List<Filme> filmes = service.findAllFilme();

        //Convertendo cada objeto da lista original para um DTO
		//List<UserDTO> listDTO = list.stream().map( x -> new UserDTO(x) ).collect(Collectors.toList());

        return ResponseEntity.ok().body(filmes);
    }

    @GetMapping("/{id}")
    public ResponseEntity< Filme > findById(@PathVariable String id){

        Filme filme = service.findByIdFilme(id);

        return ResponseEntity.ok().body(filme);

    }
    

}

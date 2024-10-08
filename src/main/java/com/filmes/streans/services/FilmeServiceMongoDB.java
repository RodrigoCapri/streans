package com.filmes.streans.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filmes.streans.documents.Filme;
import com.filmes.streans.repositories.FImeRepositoryMongoDB;
import com.filmes.streans.services.exceptions.ObjectNotFoundException;

@Service
public class FilmeServiceMongoDB {

    @Autowired
    private FImeRepositoryMongoDB repo;

    public List< Filme > findAllFilme(){
        return repo.findAll();
    }

    public Filme findByIdFilme(String id){

        Optional<Filme> obj = repo.findById(id);

        return obj.orElseThrow( () -> new ObjectNotFoundException(id) );
    }

    public Filme inserFilme(Filme obj){
        return repo.insert(obj);
    }

    public void deleteFilme(String id){
        repo.delete(this.findByIdFilme(id));
    }

    public Filme updateFilme(Filme obj){
        Filme newObj = this.findByIdFilme(obj.getId());

        this.updateData(newObj, obj);

        return repo.save(newObj);

    }

    private void updateData(Filme newObj, Filme obj){
        newObj.setNome(obj.getNome());
        newObj.setTipo(obj.getTipo());
        newObj.setGenero(obj.getGenero());
        newObj.setClassIndicativa(obj.getClassIndicativa());
        newObj.setDuration(obj.getDuration());
    }

}

package com.filmes.streans.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.filmes.streans.documents.Filme;

@Repository
public interface FImeRepositoryMongoDB extends MongoRepository< Filme, String>{

}

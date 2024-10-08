package com.filmes.streans.initialize;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.filmes.streans.documents.Filme;
import com.filmes.streans.enums.ClassIndicativa;
import com.filmes.streans.enums.Genero;
import com.filmes.streans.enums.TipoVideo;
import com.filmes.streans.repositories.FImeRepositoryMongoDB;
import java.util.List;

@Configuration
public class Initialize implements CommandLineRunner{

    @Autowired
    private FImeRepositoryMongoDB repo;

    @Override
    public void run(String... args) {

        repo.deleteAll();

        List<Genero> g1 = Arrays.asList(Genero.ROMANCE, Genero.ACAO);
        Filme f1 = new Filme("O Senhor dos Anéis", 210, null, TipoVideo.FILME, g1, ClassIndicativa.LIVRE);

        List<Genero> g2 = Arrays.asList(Genero.HEROI, Genero.ACAO);
        Filme f2 = new Filme("Os vingadores, a era de Ultron ", 195, null, TipoVideo.FILME, g2, ClassIndicativa.LIVRE);

        repo.saveAll(Arrays.asList(f1, f2));

    }

}

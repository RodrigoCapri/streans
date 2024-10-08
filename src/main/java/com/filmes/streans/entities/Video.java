package com.filmes.streans.entities;

import java.io.Serializable;

public class Video implements Serializable{

    private String nome;
    private Integer duration;

    public Video(){
    }

    public Video(String nome, Integer duration) {
        this.nome = nome;
        this.duration = duration;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video [nome=" + nome + ", duration=" + duration + "]";
    }

}

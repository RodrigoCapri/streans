package com.filmes.streans.enums;

public enum Genero {

    ROMANCE(1),
    DRAMA(2),
    ACAO(3),
    TERROR(4),
    COMEDIA(5),
    HORROR(6),
    SUSPENCE(7),
    FICCAO(8),
    HEROI(9),
    INFANTIL(10),
    AVENTURA(11);

    private int genero;

    private Genero(int i) {
        this.genero = i;
    }

    public int getGenero() {
        return genero;
    }

}

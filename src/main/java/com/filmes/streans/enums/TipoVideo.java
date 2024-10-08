package com.filmes.streans.enums;

public enum TipoVideo {

    FILME(1),
    SERIE(2),
    ANIME(3),
    DESENHO(4);

    private int tipo_video;

    private TipoVideo(int i) {
        this.tipo_video = i;
    }

    public int getTipoVideo() {
        return tipo_video;
    }

}

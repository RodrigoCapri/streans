package com.filmes.streans.enums;

public enum ClassIndicativa {

    ADULTO(18),
    ADOLESCENTE(12),
    INFANTIL(4),
    LIVRE(0);

    private int clas_indicativa;

    private ClassIndicativa(int i) {
        this.clas_indicativa = i;
    }

    public int getClasIndicativa() {
        return clas_indicativa;
    }

}

package com.filmes.streans.enums;

public enum EstadosBrasileiros {

    SP("SP", "São Paulo"),
    RJ("RJ", "Rio de Janeiro"),
    PI("PI", "Piauí"),
    MA("MA", "Maranhão"),
    SE("SE", "Sergipe"),
    AL("AL", "Alagoas"),
    PR("PR", "Paraná");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla(){
        return this.sigla;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNomeUpperCase(){
        return this.nome.toUpperCase();
    }


}

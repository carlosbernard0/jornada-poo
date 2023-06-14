package com.modulo3.exercicios.ex3;

public enum TiposDeEsportes {
    FUTEBOL(true,"Esporte com bola q usa as pernas"),
    BASQUETE(true,"Esporte com bola q usa os braços"),
    NATACAO(false,"Esporte sem bola q usa os todo o corpo para nadar"),
    JIUJITSU(false,"Esporte sem bola de categoria luta"),
    VOLEI(true,"Esporte com bola q usa os braços"),
    CROSSFIT(false,"Esporte sem bola q usa o todo o corpo e visa melhorar a resistencia");

    private String descricaoDoEsporte;
    private boolean usaBola;

    TiposDeEsportes(boolean usaBola,String descricaoDoEsporte){
        this.descricaoDoEsporte = descricaoDoEsporte;
        this.usaBola = usaBola;
    }

    public String getDescricaoDoEsporte() {
        return descricaoDoEsporte;
    }

    public boolean getUsaBola() {
        return usaBola;
    }
}
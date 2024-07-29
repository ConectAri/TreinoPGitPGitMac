package com.guardaItemPaulo.guardaItemPaulo.domain;

public enum Status {

    AGUARDANDO ("Aguardando"),

    INICIADO ("Iniciado"),

    FINALIZADO ("Finalizado");


    private final String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }
}

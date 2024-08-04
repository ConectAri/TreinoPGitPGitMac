package com.guardaItemPaulo.guardaItemPaulo.enuns;

public enum Status {

    AGUARDANDO ("Aguardando tarefa ser iniciada"),

    INICIADO ("Iniciado a tarefa"),

    FINALIZADO ("Finalizado a tarefa");


    private final String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }
}

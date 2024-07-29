package com.guardaItemPaulo.guardaItemPaulo.domain;

public enum TipoTarefa {
    GUARDA ("Guarda"),
    RETIRADA ("Retirada");

    private final String descricao;

    TipoTarefa(String descricao) {
        this.descricao = descricao;
    }

}

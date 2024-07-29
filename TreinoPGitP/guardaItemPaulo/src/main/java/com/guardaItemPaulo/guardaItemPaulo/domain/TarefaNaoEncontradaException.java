package com.guardaItemPaulo.guardaItemPaulo.domain;

public class TarefaNaoEncontradaException extends Exception {
    public TarefaNaoEncontradaException(Long idTarefa) {
        super(String.format("Tarefa com id '%d' não encontrada.", idTarefa));
    }

}

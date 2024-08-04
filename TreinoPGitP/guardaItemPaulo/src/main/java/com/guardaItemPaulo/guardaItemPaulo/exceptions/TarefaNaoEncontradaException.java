package com.guardaItemPaulo.guardaItemPaulo.exceptions;

public class TarefaNaoEncontradaException extends RuntimeException {
    public TarefaNaoEncontradaException(Long idTarefa) {
        super(String.format("Tarefa com id '%d' não encontrada.", idTarefa));
    }

}

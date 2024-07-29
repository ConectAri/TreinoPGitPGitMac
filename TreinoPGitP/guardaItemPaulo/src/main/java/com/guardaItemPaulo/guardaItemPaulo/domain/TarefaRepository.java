package com.guardaItemPaulo.guardaItemPaulo.domain;

public interface TarefaRepository {

    Tarefa save(Tarefa tarefa);

    Tarefa findById(Long id);

}

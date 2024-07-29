package com.guardaItemPaulo.guardaItemPaulo.repository;

import com.guardaItemPaulo.guardaItemPaulo.domain.Tarefa;
import com.guardaItemPaulo.guardaItemPaulo.domain.TarefaRepository;

public class TarefaRepositoryImpl  implements TarefaRepository {

    private final TarefaDAO tarefaDAO;

    public TarefaRepositoryImpl(TarefaDAO tarefaDAO) {
        this.tarefaDAO = tarefaDAO;
    }


    @Override
    public Tarefa save(Tarefa tarefa) {
        return null;
    }

    @Override
    public Tarefa findById(Long id) {
        return null;
    }
}

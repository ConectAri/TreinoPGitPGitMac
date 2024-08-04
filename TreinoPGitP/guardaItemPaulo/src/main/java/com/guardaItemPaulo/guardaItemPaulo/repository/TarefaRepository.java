package com.guardaItemPaulo.guardaItemPaulo.repository;

import com.guardaItemPaulo.guardaItemPaulo.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}

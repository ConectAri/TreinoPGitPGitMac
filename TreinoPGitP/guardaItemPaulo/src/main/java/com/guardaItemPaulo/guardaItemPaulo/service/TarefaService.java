package com.guardaItemPaulo.guardaItemPaulo.service;


import com.guardaItemPaulo.guardaItemPaulo.dto.TarefaRequestDTO;
import com.guardaItemPaulo.guardaItemPaulo.dto.TarefaResponseDTO;
import com.guardaItemPaulo.guardaItemPaulo.exceptions.TarefaNaoEncontradaException;
import com.guardaItemPaulo.guardaItemPaulo.model.Tarefa;
import com.guardaItemPaulo.guardaItemPaulo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {


    @Autowired
    private TarefaRepository tarefaRepository;

    public TarefaResponseDTO salvarTarefa(TarefaRequestDTO tarefaRequestDTO) {

        validarTarefa(tarefaRequestDTO);

        Tarefa tarefa = mapToTarefa(tarefaRequestDTO);
        tarefaRepository.save(tarefa);
        return mapToTarefaResponseDTO(tarefa);

    }

    private void validarTarefa(TarefaRequestDTO tarefaRequestDTO) {

        if (tarefaRequestDTO.getArea() == null || tarefaRequestDTO.getArea().isEmpty()) {
            throw new RuntimeException(" A área não pode ser vazia ou nula ");
        }

    }

    private TarefaResponseDTO mapToTarefaResponseDTO(Tarefa tarefa) { //Dominio(model) para DTO
        TarefaResponseDTO tarefaResponseDTO = new TarefaResponseDTO();
        tarefaResponseDTO.setId(tarefa.getId());
        tarefaResponseDTO.setTipoTarefa(tarefa.getTipoTarefa());
        tarefaResponseDTO.setStatus(tarefa.getStatus());
        tarefaResponseDTO.setItem(tarefa.getItem());
        tarefaResponseDTO.setArea(tarefa.getArea());
        return tarefaResponseDTO;
    }

    private Tarefa mapToTarefa(TarefaRequestDTO tarefaRequestDTO) { //DTO para Dominio(model)
        Tarefa tarefa = new Tarefa();
        tarefa.setTipoTarefa(tarefaRequestDTO.getTipoTarefa());
        tarefa.setStatus(tarefaRequestDTO.getStatus());
        tarefa.setItem(tarefaRequestDTO.getItem());
        tarefa.setArea(tarefaRequestDTO.getArea());
        return tarefa;
    }

    public TarefaResponseDTO buscarPorId(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(() -> new TarefaNaoEncontradaException(id));
        return mapToTarefaResponseDTO(tarefa);
    }

}

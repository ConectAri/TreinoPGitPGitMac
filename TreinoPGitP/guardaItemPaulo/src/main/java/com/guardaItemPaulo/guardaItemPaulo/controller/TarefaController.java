package com.guardaItemPaulo.guardaItemPaulo.controller;


import com.guardaItemPaulo.guardaItemPaulo.dto.ResponseDTO;
import com.guardaItemPaulo.guardaItemPaulo.dto.TarefaRequestDTO;
import com.guardaItemPaulo.guardaItemPaulo.dto.TarefaResponseDTO;
import com.guardaItemPaulo.guardaItemPaulo.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private final TarefaService tarefaService;


    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    //Cadastro
    @PostMapping
    public ResponseEntity<ResponseDTO> cadastrarTarefa(@RequestBody TarefaRequestDTO tarefaRequestDTO) {

        try {
            TarefaResponseDTO tarefaResponseDTO = tarefaService.salvarTarefa(tarefaRequestDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(201, tarefaResponseDTO));
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDTO(404, ex.getMessage()));

        }

    }

    @GetMapping
    public ResponseEntity<ResponseDTO> buscarTarefa(@RequestParam Long id) {

        try {
            TarefaResponseDTO tarefaResponseDTO = tarefaService.buscarPorId(id);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(200, tarefaResponseDTO));
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDTO(404, ex.getMessage()));

        }

    }

}

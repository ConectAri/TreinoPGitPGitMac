package com.guardaItemPaulo.guardaItemPaulo.dto;

import com.guardaItemPaulo.guardaItemPaulo.enuns.Status;
import com.guardaItemPaulo.guardaItemPaulo.enuns.TipoTarefa;
import lombok.Data;


@Data
public class TarefaResponseDTO {

    private Long id;

    private TipoTarefa tipoTarefa;

    private Status status;

    private String item;

    private String area;
}

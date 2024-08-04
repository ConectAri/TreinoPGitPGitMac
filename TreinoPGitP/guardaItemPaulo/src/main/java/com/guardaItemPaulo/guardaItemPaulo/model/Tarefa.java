package com.guardaItemPaulo.guardaItemPaulo.model;

import com.guardaItemPaulo.guardaItemPaulo.enuns.Status;
import com.guardaItemPaulo.guardaItemPaulo.enuns.TipoTarefa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoTarefa tipoTarefa;

    private Status status;

    private String item;

    private String area; //Nao pode ser vazia


}

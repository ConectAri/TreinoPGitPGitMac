package com.guardaItemPaulo.guardaItemPaulo.repository;

import com.guardaItemPaulo.guardaItemPaulo.domain.Status;
import com.guardaItemPaulo.guardaItemPaulo.domain.TipoTarefa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TarefaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTarefa tipoTarefa;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private String area;
}

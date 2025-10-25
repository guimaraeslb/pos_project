package com.pos.project.dtos;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
public class PratosPedidos {
    private String nome;
    private long preco;
}

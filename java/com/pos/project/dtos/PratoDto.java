package com.pos.project.dtos;

import java.util.List;

import lombok.Data;

@Data
public class PratoDto {

    private String nome, descricao;
    private List<String> ingredientes;
    private long preco;
    
}

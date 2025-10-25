package com.pos.project.model;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pratos")
@Data
public class Prato {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String nome, descricao;
    private List<String> ingredientes;
    private long preco;
    
}

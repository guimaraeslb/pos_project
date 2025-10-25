package com.pos.project.model;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import com.pos.project.dtos.PratosPedidos;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pedidos")
@Data
public class Pedido {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    @Embedded
    private List<PratosPedidos> pratos_pedidos;

    @Column(nullable = false)
    private long valor_total;
    
}

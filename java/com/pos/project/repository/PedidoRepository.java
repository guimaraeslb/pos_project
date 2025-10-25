package com.pos.project.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.project.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
    
}

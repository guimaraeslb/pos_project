package com.pos.project.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.project.model.Prato;

public interface PratoRepository extends JpaRepository<Prato, UUID>{
    Prato findByNome(String nome);
}

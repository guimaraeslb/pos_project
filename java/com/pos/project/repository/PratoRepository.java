package com.pos.project.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.project.model.Prato;

public interface PratoRepository extends JpaRepository<Prato, UUID>{
    
}

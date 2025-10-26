package com.pos.project.dtos;

import java.util.UUID;

import jakarta.persistence.Embeddable;

@Embeddable
public class PratosPedidos {
    
    private UUID prato_id;
    private String nome;
    private long preco;
    public UUID getPrato_id() {
        return prato_id;
    }
    public void setPrato_id(UUID prato_id) {
        this.prato_id = prato_id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getPreco() {
        return preco;
    }
    public void setPreco(long preco) {
        this.preco = preco;
    }

    
}

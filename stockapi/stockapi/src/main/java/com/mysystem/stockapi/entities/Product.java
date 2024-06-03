package com.mysystem.stockapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private boolean perecivel;
    private LocalDate validade;

    public Product(Long id, String nome, int quantidade, boolean perecivel, LocalDate validade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.perecivel = perecivel;
        this.validade = validade;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String name) {
        this.nome = name;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean isPerecivel() {
        return perecivel;
    }
    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
    public LocalDate getValidade() {
        return validade;
    }
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    // Getters and Setters
}

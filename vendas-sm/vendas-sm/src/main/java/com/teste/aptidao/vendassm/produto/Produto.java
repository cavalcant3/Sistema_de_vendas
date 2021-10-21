package com.teste.aptidao.vendassm.produto;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double preco;
    private String nome;

    @Deprecated
    public Produto() {
    }

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}

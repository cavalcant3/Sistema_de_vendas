package com.teste.aptidao.vendassm.produto;

import com.teste.aptidao.vendassm.venda.Vendas;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double preco;
    private String nome;

    //definindo relações
    @ManyToOne
    Vendas vendas;

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

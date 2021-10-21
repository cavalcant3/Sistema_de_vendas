package com.teste.aptidao.vendassm.cliente;

import com.teste.aptidao.vendassm.venda.Vendas;

import javax.persistence.*;

@Entity
public class NovoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpfOrCnpj;

//    @OneToMany
  //  Vendas vendas;

    public NovoCliente(String nome, String cpfOrCnpj) {
        this.nome = nome;
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }
}

package com.teste.aptidao.vendassm.cliente;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class NovoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpfOrCnpj;

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

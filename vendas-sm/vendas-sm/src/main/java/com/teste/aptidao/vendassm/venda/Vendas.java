package com.teste.aptidao.vendassm.venda;

import com.teste.aptidao.vendassm.cliente.NovoCliente;
import com.teste.aptidao.vendassm.produto.Produto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String data;

    //definindo relações
    @OneToMany
    List<Produto> produtos = new ArrayList<>();
    @OneToMany
    List<NovoCliente> cliente = new ArrayList<>();
}

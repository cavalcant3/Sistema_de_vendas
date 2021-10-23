package com.teste.aptidao.vendassm.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.net.ftp.FtpDirEntry;

import javax.validation.Valid;
import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto novoProduto(@RequestBody @Valid Produto novoProduto){
        produtoRepository.save(novoProduto);
        return novoProduto;
    }
    @GetMapping
    public List<Produto> listarProdutos(){
    List<Produto> produtos = produtoRepository.findAll();
    return produtos;

    }



}

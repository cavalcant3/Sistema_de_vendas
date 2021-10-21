package com.teste.aptidao.vendassm.cliente;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping
    public NovoCliente cadastroCliente(@RequestBody @Valid NovoCliente novoCliente){
        return novoCliente;
    }

}

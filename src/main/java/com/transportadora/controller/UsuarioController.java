package com.transportadora.controller;

import com.transportadora.model.Motorista;
import com.transportadora.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // Anotação para um controlador REST
public class MotoristaController {

    @Autowired
    private MotoristaService motoristaService;  // Injeção de dependência do serviço

    @GetMapping("/motorista")  // Mapeia uma requisição GET para listar os clientes
    public List<Motorista> listarMotorista() {
        return clienteService.listarMotorista();  // Chama o serviço para obter os dados
    }

    @PostMapping("/motorista")  // Mapeia uma requisição POST para criar um novo cliente
    public Cliente adicionarMotorista(@RequestBody Cliente motorista) {
        return MotoristaService.salvarMotorista(motorista);  // Chama o serviço para salvar um cliente
    }
}
package com.transportadora.service;

import com.transportadora.model.Motorista;
import com.transportadora.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Anotação que marca a classe como um serviço
public class MotoristaService {

    @Autowired
    private MotoristaRepository clienteRepository;  // Injeção do repositório

    public List<Motorista> listarMotorista() {
        return MotoristaRepository.findAll();  // Recupera todos os motoristas do banco de dados
    }

    public Motorista salvarMotorista(motorista motorista) {
        return motoristaRepository.save(motorista);  // Salva um novo motoristas no banco de dados
    }
}

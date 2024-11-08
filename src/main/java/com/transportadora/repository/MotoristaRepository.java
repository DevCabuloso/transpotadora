package com.transportadora.repository;

import com.transportadora.model.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, por exemplo:
    // List<Cliente> findByNome(String nome);
}

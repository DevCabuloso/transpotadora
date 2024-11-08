package com.transportadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Anotação para marcar a classe como ponto de entrada do Spring Boot
public class TranspotadoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranspotadoraApplication.class, args);  // Inicia a aplicação
    }
}

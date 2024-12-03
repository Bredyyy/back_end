package com.tilapio.back_end.model;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA
@Table(name = "users") // Define o nome da tabela no banco de dados como "users"
public class User {

    @Id // Indica que este atributo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração da chave primária como auto-incremento
    private Long id; // Atributo que armazena o ID do usuário

    @Column(nullable = false) // Define que o atributo "name" não pode ser nulo
    private String name; // Atributo que armazena o nome do usuário

    @Column(nullable = false, unique = true) // Define que o atributo "email" não pode ser nulo e deve ser único
    private String email; // Atributo que armazena o email do usuário

    // Getters e setters para os atributos da classe
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

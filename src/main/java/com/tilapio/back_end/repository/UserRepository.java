package com.tilapio.back_end.repository;

import com.tilapio.back_end.model.User; // Importa a classe User que representa a entidade de usuário
import org.springframework.data.jpa.repository.JpaRepository; // Importa a interface JpaRepository do Spring Data JPA
import org.springframework.stereotype.Repository; // Anotação para indicar que esta interface é um repositório

@Repository // Indica que esta interface é um repositório Spring
public interface UserRepository extends JpaRepository<User, Long> {
    // Estende JpaRepository, especificando a entidade (User) e o tipo da chave primária (Long)
}

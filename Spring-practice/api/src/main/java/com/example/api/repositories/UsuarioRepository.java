package com.example.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}

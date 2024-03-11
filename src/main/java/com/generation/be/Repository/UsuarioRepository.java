package com.generation.be.Repository;

import com.derechos.demo.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);

    Optional<Usuario> findByEmail(String email);

    void deleteByUsername(String username);

    void deleteByEmail(String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}

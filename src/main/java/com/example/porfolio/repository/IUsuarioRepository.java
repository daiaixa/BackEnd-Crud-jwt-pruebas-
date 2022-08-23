
package com.example.porfolio.repository;


import com.example.porfolio.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    Optional <Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
    
    
}

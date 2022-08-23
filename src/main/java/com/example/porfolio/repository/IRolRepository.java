
package com.example.porfolio.repository;

import com.example.porfolio.enums.RolNombre;
import com.example.porfolio.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
    
}

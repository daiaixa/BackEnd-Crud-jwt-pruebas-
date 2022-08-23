
package com.example.porfolio.service;

import com.example.porfolio.enums.RolNombre;
import com.example.porfolio.model.Rol;
import com.example.porfolio.repository.IRolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    
    @Autowired
    IRolRepository rolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    public void guardar (Rol rol) {
        rolRepo.save(rol);
    }
    
     
}

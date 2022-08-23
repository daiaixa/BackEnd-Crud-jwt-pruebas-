
package com.example.porfolio.service;

import com.example.porfolio.enums.RolNombre;
import com.example.porfolio.model.Rol;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


public interface IRolService {
    
    
    @Autowired
    
     public Optional <Rol> getByRolNombre(RolNombre rolNombre); 
    
}

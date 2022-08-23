
package com.example.porfolio.service;

import com.example.porfolio.model.Usuario;
import com.example.porfolio.repository.IUsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepo;
    
    public Optional<Usuario> getByEmail(String email) {
        return usuarioRepo.findByEmail(email);
    }
    
    public boolean existsByEmail(String email) {
        return usuarioRepo.existsByEmail(email);
    }

    public void guardarUsuario(Usuario usu) {
        usuarioRepo.save(usu);
    }
  
 

    
}
 
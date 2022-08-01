
package com.example.porfolio.controller;

import com.example.porfolio.model.Experiencia;
import com.example.porfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class experienciaController {
    
    @Autowired
    public IExperienciaService expService;
    
    
    @PostMapping("/new/experiencia")
    public void agregarExp (@RequestBody Experiencia exp) {
        expService.crearExperiencia(exp);        
    }
    
    @GetMapping("/lista/experiencia")
    public List<Experiencia> verListaExp() {
        return expService.verExperiencia();
    }
    
    @DeleteMapping("/eliminar/experiencia")
    public void eliminarExp(Long id) {
        expService.borrarExperiencia(id);
    }
    
    @GetMapping("/ver/experiencia")
    public Experiencia verExp (Long id) {
       return expService.buscarExperiencia(id);
    }
    
}

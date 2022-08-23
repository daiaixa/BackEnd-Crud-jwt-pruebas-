
package com.example.porfolio.controller;

import com.example.porfolio.model.Educacion;
import com.example.porfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class educacionController {
    
    @Autowired
    public IEducacionService eduService;
    
    @PostMapping("/new/educacion")
    public void agregarEdu (@RequestBody Educacion edu) {
        eduService.crearEducacion(edu);        
    }
    
    @GetMapping("/lista/educacion")
    public List<Educacion> verListaEdu() {
        return eduService.verEducacion();
    }
    
    @DeleteMapping("/eliminar/educacion")
    public void eliminarEdu(Long id) {
        eduService.borrarEducacion(id);
    }
    
    @GetMapping("/ver/educacion")
    public Educacion verEdu (Long id) {
       return eduService.buscarEducacion(id);
    }
    
}

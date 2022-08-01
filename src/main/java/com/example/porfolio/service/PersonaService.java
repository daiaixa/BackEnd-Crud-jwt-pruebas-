/* Esta clase sera quien implemente la interfaz
completando los metodos ya declarados en la interfaz
 */
package com.example.porfolio.service;

import com.example.porfolio.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.porfolio.repository.IPersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    /*mediante la anotacion, podremos hacer una inyeccion de dependencia, entre la clase y la interfaz, sin
    necesidad de estar ocupando el NEW repetidas veces (podemos hacer tambien inyecciones mediante
    constructores, setter y demas)*/
    @Autowired 
    public IPersonaRepository persoRepo;

    @Override/*con esta aotacion se podra sobreescribir los metodos*/
    public List<Persona> verPersonas() {
        return persoRepo.findAll(); /*es el metodo que permite traer todos los elementos*/
    }       
        
    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }
        
    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null); /*si no encuentra la persona
        devuelve un NULL */
    }
}


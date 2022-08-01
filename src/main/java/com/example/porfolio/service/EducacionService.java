package com.example.porfolio.service;

import com.example.porfolio.model.Educacion;
import com.example.porfolio.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public IEducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    /*cuando queremos buscar una persona en particular, podemos tener el
    problema de que no la encuentre, lo solucionamos quitando el OPCIONAL
    y agregando un metodo mas llamado "orElse(null)"
     */
 /*si encuentra la persona,devuelve la persona, o sino devuelve un NULL*/

}

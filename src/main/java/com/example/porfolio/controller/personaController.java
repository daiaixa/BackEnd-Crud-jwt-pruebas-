/* Sera la capa controladora de nuestros endpoints(cada una de las direcciones
*de la api que van a recibir nuestras solicitudes
*lo que estamos haciendo es crear una api
*y para eso hay que mapearla
*y la cual redirijira nuestras peticiones y decidir para que lado van a ir cada 
*de las operaciones o solicitudes de los clientes
*ESTO ES UNA API
 */
package com.example.porfolio.controller;

import com.example.porfolio.model.Persona;
import com.example.porfolio.service.IPersonaService;
/*import java.util.ArrayList;*/
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/*import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*import org.springframework.web.bind.annotation.PutMapping;*/
/*import org.springframework.web.bind.annotation.RequestBody;*/
/*import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personaController {
/* ahora hacemos la coneccion de todas las capas con el controlador

    /* nuevamente necesitamos una inyeccion de dependencia, de la controladora con nuestro service
    nuestra controladora va a estar conectada al servicio,
    el servicio a nuestro repositorio
    y el repositorio a nuestra base de datos */
   @Autowired
   public IPersonaService persoService; /*hacer la implemnetacion de nuestra interfaz*/
  
   @PostMapping("/new/persona")
   public void agregarPersona (@RequestBody Persona pers){
       persoService.crearPersona(pers);
       
   }
   
   @GetMapping("/ver/persona")
   @ResponseBody
   public List<Persona> verPersonas() {
    return persoService.verPersonas();
}
   
   @DeleteMapping("/borrar/{id}")
   public void borrarPersona(@PathVariable Long id) {
       persoService.borrarPersona(id);
   }
   
   /*las versiones nuevas de habbernite ya no existe un metodo EDIT
   sino que cuando queremos editar un objeto
   debemos utilizar el metodo SEVE (el que implementamos en nuestro servicio para hacer las altas*/
    
}

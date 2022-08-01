/*la capa de servicio se encarga de la capa de negocio, el procesamiento logico de la aplicacion
cuales van a ser las funciones, cuales son los datos que necesitamos
como los va a traer, como los va a manejar, como se los va a presentar al usuario
para ello implementamos esta interfaz y crear una clase comun que tendra la implementacion de todos
los metodos que se declararan en la interfaz, pero sin implementacion, ya que es la clase la que se encarga
de implementarlos
 */
package com.example.porfolio.service;

import com.example.porfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List <Persona> verPersonas(); 
    public void crearPersona (Persona pers);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    
    
}

/*Enviaremos un nuevo usuario
 * exactamente igual a la clase usuario sin ID
con la doferencia que la lista sera del tipo cadena ya que se trabaja con JSON
*/
package com.example.porfolio.dto;


import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NuevoUsuario {
      
    private String nombre; 
    private String email;   
    private String password;    
    private Set<String> roles = new HashSet<>();
}

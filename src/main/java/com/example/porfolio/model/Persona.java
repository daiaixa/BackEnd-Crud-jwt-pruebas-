/* con LOMBOK podemos usar las anotaciones para que de manera
automatica nos cree los setters y getter correspondientes
*/
package com.example.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/* queremos que a partir de una URL que vamos a armar con un metodo
vamos a recibir datos, y a partir de esos datos vamos a crear un objeto persona
y vamos a agregarlo a una lista(porque aun no integramos la BD)
nos dirigimos al controller y creamor una lista 
luego armamos el endpoint 
*/

@Getter 
@Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String acerca_de;
    private String foto_perfil;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String acerca_de, String foto_perfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca_de = acerca_de;
        this.foto_perfil = foto_perfil;
    }


    
}


package com.example.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String categoria;
    private String puesto;
    private String descripcion;
    private String referencia;
    private String tel_refe;
    private int fecha_inicio;
    private int fecha_fin;

    public Experiencia() {
    }

    public Experiencia(String categoria, String puesto, String descripcion, String referencia, String tel_refe, int fecha_inicio, int fecha_fin) {
        this.categoria = categoria;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.tel_refe = tel_refe;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    
    
}

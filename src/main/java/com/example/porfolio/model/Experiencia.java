
package com.example.porfolio.model;

import java.sql.Date;
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
    private Date fecha_inicio;
    private Date fecha_fin;

    public Experiencia() {
    }

    public Experiencia(Long id, String categoria, String puesto, String descripcion, String referencia, String tel_refe, Date fecha_inicio, Date fecha_fin) {
        this.id = id;
        this.categoria = categoria;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.tel_refe = tel_refe;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    
    
    
}

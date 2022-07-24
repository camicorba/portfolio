package com.Portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProy;
    private String nombreProy;
    private String imgProy;
    private String descProy;


    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getImgProy() {
        return imgProy;
    }

    public void setImgProy(String imgProy) {
        this.imgProy = imgProy;
    }

    public String getDescProy() {
        return descProy;
    }

    public void setDescProy(String descProy) {
        this.descProy = descProy;
    } 
    public Proyectos() {
    }

    public Proyectos(Long idProy, String nombreProy, String imgProy, String descProy) {
        this.idProy = idProy;
        this.nombreProy = nombreProy;
        this.imgProy = imgProy;
        this.descProy = descProy;
    }
}

package com.Portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExp;
    
    @NotNull
    private String tituloExp;
    
    @NotNull
    private String puestoExp;
    
    @NotNull
    private String fechaiExp;
    
    private String fechafExp;
    
    @NotNull
    private String descExp;
    
    private String linkExp;

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getPuestoExp() {
        return puestoExp;
    }

    public void setPuestoExp(String puestoExp) {
        this.puestoExp = puestoExp;
    }

    public String getFechaiExp() {
        return fechaiExp;
    }

    public void setFechaiExp(String fechaiExp) {
        this.fechaiExp = fechaiExp;
    }

    public String getFechafExp() {
        return fechafExp;
    }

    public void setFechafExp(String fechafExp) {
        this.fechafExp = fechafExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getLinkExp() {
        return linkExp;
    }

    public void setLinkExp(String linkExp) {
        this.linkExp = linkExp;
    }

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String puestoExp, String fechaiExp, String fechafExp, String descExp, String linkExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.puestoExp = puestoExp;
        this.fechaiExp = fechaiExp;
        this.fechafExp = fechafExp;
        this.descExp = descExp;
        this.linkExp = linkExp;
    }
    
}

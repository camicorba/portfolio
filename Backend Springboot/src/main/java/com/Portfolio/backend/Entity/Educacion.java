package com.Portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    @NotNull
    private String tituloEdu;
    @NotNull
    private String lugarEdu;
    @NotNull
    private String fechaiEdu;
    private String fechafEdu;
    @NotNull
    private String descEdu;
    private String certiEdu;

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getLugarEdu() {
        return lugarEdu;
    }

    public void setLugarEdu(String lugarEdu) {
        this.lugarEdu = lugarEdu;
    }

    public String getFechaiEdu() {
        return fechaiEdu;
    }

    public void setFechaiEdu(String fechaiEdu) {
        this.fechaiEdu = fechaiEdu;
    }

    public String getFechafEdu() {
        return fechafEdu;
    }

    public void setFechafEdu(String fechafEdu) {
        this.fechafEdu = fechafEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getCertiEdu() {
        return certiEdu;
    }

    public void setCertiEdu(String certiEdu) {
        this.certiEdu = certiEdu;
    }

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String lugarEdu, String fechaiEdu, String fechafEdu, String descEdu, String certiEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.lugarEdu = lugarEdu;
        this.fechaiEdu = fechaiEdu;
        this.fechafEdu = fechafEdu;
        this.descEdu = descEdu;
        this.certiEdu = certiEdu;
    }
      
}

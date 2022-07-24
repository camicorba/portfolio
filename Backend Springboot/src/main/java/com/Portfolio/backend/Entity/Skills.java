package com.Portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSkills;
    private String nombreSkill;
    private String imgSkill;
    private String porcentajeSkill;

    public Long getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(Long idSkills) {
        this.idSkills = idSkills;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }

    public String getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(String porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    public Skills() {
    }

    public Skills(Long idSkills, String nombreSkill, String imgSkill, String porcentajeSkill) {
        this.idSkills = idSkills;
        this.nombreSkill = nombreSkill;
        this.imgSkill = imgSkill;
        this.porcentajeSkill = porcentajeSkill;
    }
    
}

package com.Portfolio.backend.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titulo;

    @NotNull
    @Size(min = 1, max = 300, message = "no cumple con la longitud")
    private String descripcion;

    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String imageheader;

    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String imageperfil;

    //GETTER Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageheader() {
        return imageheader;
    }

    public void setImageheader(String imageheader) {
        this.imageheader = imageheader;
    }

    public String getImageperfil() {
        return imageperfil;
    }

    public void setImageperfil(String imageperfil) {
        this.imageperfil = imageperfil;
    }
    
    //RELACIONAR LAS TABLAS
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List<Proyectos> proyectosList;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String descripcion, String imageheader, String imageperfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imageheader = imageheader;
        this.imageperfil = imageperfil;
    }
    
    
    
}

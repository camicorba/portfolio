package com.Portfolio.backend.Interface;

import com.Portfolio.backend.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    //Traer lista
    public List<Experiencia> getExperiencia();
    
    //Guardar objeto
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar datos
    public void deleteExperiencia(Long id);
    
    //Buscar
    public Experiencia findExperiencia(Long id);
}

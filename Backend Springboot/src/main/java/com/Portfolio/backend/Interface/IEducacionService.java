package com.Portfolio.backend.Interface;

import com.Portfolio.backend.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //Traer lista
    public List<Educacion> getEducacion();
    
    //Guardar objeto
    public void saveEducacion(Educacion educacion);
    
    //Eliminar datos
    public void deleteEducacion(Long id);
    
    //Buscar
    public Educacion findEducacion(Long id);
}

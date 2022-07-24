package com.Portfolio.backend.Interface;

import com.Portfolio.backend.Entity.Proyectos;
import java.util.List;

public interface IProyectosService {
        //Traer lista
    public List<Proyectos> getProyectos();
    
    //Guardar objeto
    public void saveProyectos(Proyectos proyectos);
    
    //Eliminar datos
    public void deleteProyectos(Long id);
    
    //Buscar
    public Proyectos findProyectos(Long id);
}

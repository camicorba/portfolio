package com.Portfolio.backend.Interface;

import com.Portfolio.backend.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de Persona
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar dato de persona
    public void deletePersona(Long id);
    
    //buscar persona
    public Persona findPersona(Long id);
}

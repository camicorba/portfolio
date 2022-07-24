package com.Portfolio.backend.Interface;

import com.Portfolio.backend.Entity.Skills;
import java.util.List;

public interface ISkillsService {
    //Traer lista
    public List<Skills> getSkills();
    
    //Guardar objeto
    public void saveSkills(Skills Skill);
    
    //Eliminar datos
    public void deleteSkills(Long id);
    
    //Buscar
    public Skills findSkills(Long id);
}
